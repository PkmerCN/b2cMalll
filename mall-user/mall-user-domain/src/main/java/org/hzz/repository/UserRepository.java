package org.hzz.repository;

import org.hzz.aggregate.MallUser;

/**
 * @author 胖卡
 * @version 1.0.0
 * @date 2024/6/19
 */
public interface UserRepository {
    MallUser register(MallUser mallUser);
}
