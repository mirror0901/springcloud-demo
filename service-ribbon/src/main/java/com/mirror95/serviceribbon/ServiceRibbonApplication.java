/**
 * Copyright (C), 2017-2019, 苏州立昌科技有限公司
 * FileName: ServiceRibbonApplication
 * Author:   mirror_huang
 * Date:     2019/1/14 0014 16:31
 * Description:
 * History:
 * <author>          <qq>          <version>
 * mirror_huang     1755496180       版本号
 */
package com.mirror95.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mirror_huang
 * @create 2019/1/14 0014 16:31
 * @since 1.0.0
 */
@EnableHystrix
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
