package com.wyx.MoneyManager.Mapper;

import com.wyx.MoneyManager.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUserByUserId(int userId);
}
