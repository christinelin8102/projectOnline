package com.christine.controller;

import com.christine.model.UserTest;
import com.christine.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("test")
public class UserController {

    @Autowired
    UserTestService us;

    @GetMapping(value="/findById" , produces = "application/json")
    @ResponseBody
    public Map<String, Object> findById(@RequestParam("id") Long id){
        Map<String, Object> map = new HashMap<String, Object>();

        UserTest data = us.findById(id);
        map.put("data",data);

        return map;
    }
}
