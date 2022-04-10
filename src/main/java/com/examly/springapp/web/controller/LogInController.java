package com.examly.springapp.web.controller;
import com.examly.springapp.constants.Constants;
import com.examly.springapp.service.UserService;
import com.examly.springapp.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class LogInController {

    @Autowired
    UserService userService;

    @PostMapping(Constants.ADMIN_LOGIN_URL_MAPPING)
    @ResponseBody
    public HashMap<String, String> adminLogin(@RequestBody UserRegistrationDto dto){

        return userService.loginCheck(dto) ;
    }

    @PostMapping(Constants.STUDENT_LOGIN_URL_MAPPING)
    @ResponseBody
    public HashMap<String, String> userLogin(@RequestBody UserRegistrationDto dto){
        return userService.loginCheck(dto);
    }
}
