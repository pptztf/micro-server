package product.main;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.*;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.server.Neo4jServer;
import org.springframework.data.neo4j.server.RemoteServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by ZhangY05 on 2017/7/5.
 */
@Configuration
@ComponentScan(basePackages = "product.web")
@EnableNeo4jRepositories(basePackages = "product.dao")
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableEurekaClient
@SpringBootApplication
public class productApplication extends Neo4jConfiguration {


    public static  void main(String[] args){
        SpringApplication.run(productApplication.class, args);
       /* ApplicationInfoManager.getInstance().setInstanceStatus(InstanceInfo.InstanceStatus.UP);*/
        System.out.println("neo4j db start~ product application");
    }

    @Bean
    @Override
    public Neo4jServer neo4jServer() {
        return new RemoteServer("http:127.0.0.1:7474","neo4j","123456");
    }

    @Bean
    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory("product.domain");
    }

    @Bean
    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Session getSession() throws Exception {
        return super.getSession();
    }

    @Bean
    public CrossFilter croFilter() {
        final CrossFilter crossFilter = new CrossFilter();
        return crossFilter;
    }
}
