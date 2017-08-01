package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * Created by ZhangY05 on 2017/7/5.
 */
@SpringBootApplication
@EnableSidecar
public class gatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(gatewayApplication.class, args);
    }
}
