package com.examly.springapp.service;

import com.examly.springapp.model.Role;
import com.examly.springapp.model.User;
import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import com.examly.springapp.constants.Constants;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user =new User(userRegistrationDto.getEmail(),userRegistrationDto.getUserName(),
                userRegistrationDto.getUserMobileNumber(),userRegistrationDto.getUserPassword()
                ,Constants.ROLE_STUDENT);
        try {return userRepository.save(user);}
        catch(Exception e){
            System.out.println(Constants.EXCEPTION_SAVE_USER+e);
            return null;
        }
    }

    @Override
    public HashMap<String,String> loginCheck(UserRegistrationDto dto) {

        try {
            User user=userRepository.findByEmail(dto.getEmail());
            if(dto.getUserPassword().equals(user.getUserPassword())){
                HashMap<String,String> hm = new HashMap<>();
                hm.put(Constants.ROLE,user.getRoles());
                hm.put(Constants.USER_ID,String.valueOf(user.getUserId()));
                return hm;
            }
            else{
                HashMap<String,String> hm = new HashMap<>();
                hm.put(Constants.ERROR,Constants.EMAIL_PASSWORD_WRONG);
                return hm;
            }
        }
        catch(Exception e){
            HashMap<String,String> hm = new HashMap<>();
            hm.put(Constants.ERROR,Constants.EMAIL_PASSWORD_WRONG);
            return hm;
        }

    }


}
