package org.hzz.application.service;

import org.hzz.application.command.UserRegisterCommand;
import org.hzz.application.resp.UserRegisterRespDTO;

/**
 * @author 胖卡
 * @version 1.0.0
 * @date 2024/6/19
 */
public interface UserService {
    UserRegisterRespDTO register(UserRegisterCommand command);
}
