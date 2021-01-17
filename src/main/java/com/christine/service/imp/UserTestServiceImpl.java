package com.christine.service.imp;

import com.christine.mapper.UserTestMapper;
import com.christine.model.UserTest;
import com.christine.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserTestServiceImpl implements UserTestService {

    @Autowired
    UserTestMapper userTestMapper;

    @Override
    public UserTest findById(Long id) {
        return userTestMapper.findById(id);

    }
}
