package org.hzz.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.hzz.dao.entity.MallUserEntity;

/**
 * @author 胖卡
 * @version 1.0.0
 * @date 2024/6/19
 */
@Mapper
public interface UserRepositoryMapper {
    void insert(MallUserEntity user);
}
