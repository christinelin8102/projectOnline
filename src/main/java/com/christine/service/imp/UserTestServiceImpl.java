package com.christine.service.imp;

import com.christine.mapper.UserTestMapper;
import com.christine.model.UserTest;
import com.christine.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTestServiceImpl implements UserTestService {

    @Autowired
    private UserTestMapper userTestMapper;

    @Override
    public UserTest findByUserNo(Long user_no) {
        return userTestMapper.findByUserNo(user_no);
    }
}
