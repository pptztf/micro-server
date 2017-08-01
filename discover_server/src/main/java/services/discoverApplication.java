package services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by ZhangY05 on 2017/7/5.
 */
@SpringBootApplication
@EnableEurekaServer
public class discoverApplication {

    public static void main(String args[]){
        SpringApplication.run(discoverApplication.class, args);
    }
}
