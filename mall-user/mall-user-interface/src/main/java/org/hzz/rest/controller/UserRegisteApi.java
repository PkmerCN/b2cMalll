package org.hzz.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 胖卡
 * @version 1.0.0
 * @date 2024/6/19
 */
@RequestMapping("/user")
public interface UserRegisteApi {

    @PostMapping("/registe")
    default void registe(){
        throw new UnsupportedOperationException("未实现");
    }
}
