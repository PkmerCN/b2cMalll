package org.hzz.repository;

import org.hzz.aggregate.MallUser;
import org.hzz.dao.mapper.UserRepositoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author 胖卡
 * @version 1.0.0
 * @date 2024/6/19
 */
@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private UserRepositoryMapper userRepositoryMapper;

    @Override
    public MallUser register(MallUser mallUser) {
        return null;
    }
}
