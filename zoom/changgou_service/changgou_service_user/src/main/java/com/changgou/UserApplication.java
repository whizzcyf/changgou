package com.changgou;

import com.changgou.interceptor.FeignInterceptor;
import com.changgou.user.config.TokenDecode;
import com.changgou.util.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.changgou.user.dao"})
@EnableFeignClients(basePackages = {"com.changgou.goods.feign"})
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run( UserApplication.class);
    }

    @Bean
    public TokenDecode tokenDecode(){
        return new TokenDecode();
    }

    @Bean
    public FeignInterceptor feignInterceptor(){
        return new FeignInterceptor();
    }

    @Bean
    public IdWorker idWorker(){

        return  new IdWorker(1,1);
    }


}
