package com.examly.springapp.service;


import com.examly.springapp.model.User;

import com.examly.springapp.web.dto.UserRegistrationDto;

import org.springframework.stereotype.Service;


public interface AdminService  {

    User save(UserRegistrationDto userRegistrationDto);

}
