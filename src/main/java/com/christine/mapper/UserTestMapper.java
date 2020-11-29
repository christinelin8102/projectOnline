package com.christine.mapper;

import com.christine.model.UserTest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserTestMapper {
    public UserTest findByUserNo(Long user_no);
}
