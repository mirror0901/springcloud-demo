/**
 * Copyright (C), 2017-2019, 苏州立昌科技有限公司
 * FileName: HiController
 * Author:   mirror_huang
 * Date:     2019/1/14 0014 18:17
 * Description:
 * History:
 * <author>          <qq>          <version>
 * mirror_huang     1755496180       版本号
 */
package com.mirror95.servicefeign.controller;

import com.mirror95.servicefeign.client.ServiceFeignHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mirror_huang
 * @create 2019/1/14 0014 18:17
 * @since 1.0.0
 */
@RestController
public class HiController {

    /**
     * 编译器报错，无视。因为这个bean是在程序启动的时候注入的，编译器感知不到
     */
    @Autowired
    ServiceFeignHi serviceFeignHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return serviceFeignHi.sayHiFromClientOne(name);
    }


}
