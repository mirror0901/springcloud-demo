/**
 * Copyright (C), 2017-2019, 苏州立昌科技有限公司
 * FileName: HelloController
 * Author:   mirror_huang
 * Date:     2019/1/14 0014 17:05
 * Description:
 * History:
 * <author>          <qq>          <version>
 * mirror_huang     1755496180       版本号
 */
package com.mirror95.serviceribbon.controller;

import com.mirror95.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mirror_huang
 * @create 2019/1/14 0014 17:05
 * @since 1.0.0
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

}
