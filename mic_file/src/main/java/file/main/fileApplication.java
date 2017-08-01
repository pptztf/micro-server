package file.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * Created by ZhangY05 on 2017/7/11.
 */
@EnableConfigurationProperties()
@SpringBootApplication
@EnableEurekaClient
public class fileApplication {


    @Bean
    public CrossFilter getCrossFilter(){
        return new CrossFilter();
    }

    public static void main(String[] args){
        SpringApplication.run(fileApplication.class,args);
    }


}
