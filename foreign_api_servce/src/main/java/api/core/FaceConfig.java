package api.core;

import api.face.product.ProductFace;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZhangY05 on 2017/7/6.
 */
@Configuration
@EnableDiscoveryClient
public class FaceConfig {

    @Bean
    public ProductFace getProductFace(){
        return new ProductFace();
    }
}
