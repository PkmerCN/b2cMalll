package org.hzz.application.service.handler;

import org.hzz.application.command.UserRegisterCommand;
import org.hzz.application.resp.UserRegisterRespDTO;
import org.hzz.domain.CommandHandler;
import org.springframework.stereotype.Component;

/**
 * @author 胖卡
 * @version 1.0.0
 * @date 2024/6/19
 */
@Component
public class UserRegisterCommandHandler implements CommandHandler<UserRegisterCommand,UserRegisterRespDTO> {
    @Override
    public UserRegisterRespDTO handler(UserRegisterCommand requestParam) {
        return null;
    }
}
