package com.mirror95.servicefeign.client;

import com.mirror95.servicefeign.client.fallback.ServiceFeignHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * @date: 2019/1/14 0014 17:56
 * @qq: 1755496180
 * @description:
 */
@FeignClient(value = "service-hi", fallback = ServiceFeignHiHystric.class)
public interface ServiceFeignHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
