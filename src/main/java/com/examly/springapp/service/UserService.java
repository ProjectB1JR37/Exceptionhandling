package com.examly.springapp.service;
import java.util.*;
import com.examly.springapp.model.User;
import com.examly.springapp.model.Role;
import com.examly.springapp.web.dto.UserRegistrationDto;


public interface UserService {

    User save(UserRegistrationDto userRegistrationDto);
    HashMap<String,String> loginCheck(UserRegistrationDto dto);
}
