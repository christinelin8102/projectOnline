package com.christine.mapper;

import com.christine.model.UserTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserTestMapper {
    UserTest findById(Long id);
}
