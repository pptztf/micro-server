package promotion.main;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.server.Neo4jServer;
import org.springframework.data.neo4j.server.RemoteServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by ZhangY05 on 2017/7/6.
 */
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan(basePackages = "promotion.dao,promotion.web")
@EnableNeo4jRepositories(basePackages = "promotion.dao")
@EnableEurekaServer
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class promotionApplication extends Neo4jConfiguration {


    public static void main(String[] args){
        SpringApplication.run(promotionApplication.class,args);
    }

    @Override
    public Neo4jServer neo4jServer() {
        return new RemoteServer("http:127.0.0.1:7474","neo4j","123456");
    }

    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory("promotion.domain");
    }
}
