/**
 * Copyright (C), 2017-2019, 苏州立昌科技有限公司
 * FileName: MyFilter
 * Author:   mirror_huang
 * Date:     2019/1/14 0014 22:40
 * Description:
 * History:
 * <author>          <qq>          <version>
 * mirror_huang     1755496180       版本号
 */
package com.mirror95.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mirror_huang
 * @create 2019/1/14 0014 22:40
 * @since 1.0.0
 */
@Component
public class MyFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
