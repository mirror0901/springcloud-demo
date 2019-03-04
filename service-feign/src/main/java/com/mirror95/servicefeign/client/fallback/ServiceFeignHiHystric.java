/**
 * Copyright (C), 2017-2019, 苏州立昌科技有限公司
 * FileName: ServiceFeignHiHystric
 * Author:   mirror_huang
 * Date:     2019/1/14 0014 20:01
 * Description:
 * History:
 * <author>          <qq>          <version>
 * mirror_huang     1755496180       版本号
 */
package com.mirror95.servicefeign.client.fallback;

import com.mirror95.servicefeign.client.ServiceFeignHi;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mirror_huang
 * @create 2019/1/14 0014 20:01
 * @since 1.0.0
 */
@Component
public class ServiceFeignHiHystric implements ServiceFeignHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}