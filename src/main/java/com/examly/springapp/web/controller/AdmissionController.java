package com.examly.springapp.web.controller;

import com.examly.springapp.model.Admission;
import com.examly.springapp.service.AdmissionService;
import com.examly.springapp.constants.Constants;
import com.examly.springapp.web.dto.AdmissionAddressDto;
import com.examly.springapp.web.dto.AdmissionSaveDto;
import com.examly.springapp.web.dto.GetAllAdmissionRequestDto;
import com.examly.springapp.web.dto.GetAllAppliedAdmissionDto;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AdmissionController {

    @Autowired
    AdmissionService admissionService;



    @PostMapping(Constants.ENROLL_URL_MAPPING)
    @ResponseBody
    public String enroll(@RequestBody AdmissionAddressDto admissionSaveDto){
        admissionService.saveAdmission(admissionSaveDto);
        return Constants.APPLIED_FOR_ADMISSION;
    }

    @GetMapping(Constants.GET_ADMISSION_REQUESTS_URL_MAPPING)
    @ResponseBody
    public List<GetAllAdmissionRequestDto> getAdmissionRequests(){
        return admissionService.getAllAdmissionRequests();
    }

    @GetMapping(Constants.ACCEPT_ADMISSION_URL_MAPPING)
    @ResponseBody
    public String acceptAdmission(@RequestParam(Constants.ADMISSION_ID)long admissionId){
        admissionService.acceptAdmission(admissionId);
        return Constants.ADMISSION_ACCEPTED;

    }

    @GetMapping(Constants.DENY_ADMISSION_URL_MAPPING)
    @ResponseBody
    public String denyAdmission(@RequestParam(Constants.ADMISSION_ID)long admissionId){
        admissionService.denyAdmission(admissionId);
        return Constants.ADMISSION_DENIED;

    }

    @GetMapping(Constants.GET_ALL_ACCEPTED_ADMISSION_URL_MAPPING)
    @ResponseBody
    public List<GetAllAdmissionRequestDto> getAllAcceptedAdmission(){
        return admissionService.getAllAcceptedAdmission();
    }

    @GetMapping(Constants.GET_ALL_DENIED_ADMISSION_URL_MAPPING)
    @ResponseBody
    public List<GetAllAdmissionRequestDto> getAllDeniedAdmission(){
        return admissionService.getAllDeniedAdmission();
    }

    @GetMapping(Constants.GET_ADMISSION_URL_MAPPING)
    @ResponseBody
    public AdmissionAddressDto getAdmission(@RequestParam(Constants.ADMISSION_ID)long admissionId){

        return admissionService.getAdmissionById(admissionId);

    }

    @PutMapping(Constants.EDIT_ADMISSION_URL_MAPPING)
    @ResponseBody
    public String editAdmission(@RequestBody AdmissionAddressDto dto, @RequestParam(Constants.ADMISSION_ID)long id){
        admissionService.editAdmission(dto,id);
        return Constants.ADMISSION_EDITED;
    }

    @GetMapping(Constants.GET_ALL_APPLIED_ADMISSION_BY_STUDENT_URL_MAPPING)
    @ResponseBody
    public List<GetAllAppliedAdmissionDto> getAllAppliedAdmissionByStudent(@RequestParam(Constants.USER_ID) long userId){
        return admissionService.getAllAppliedCourses(userId);

    }

    @DeleteMapping(Constants.DELETE_ADMISSION_URL_MAPPING)
    @ResponseBody
    public String deleteAdmission(@RequestParam(Constants.ADMISSION_ID)long id){
        return admissionService.deleteAdmission(id);
    }

    @GetMapping(Constants.ACCEPT_ADMISSION_BY_STUDENT_URL_MAPPING)
    @ResponseBody
    public String acceptAdmissionByStudent(@RequestParam(Constants.ADMISSION_ID) long admissionId, @RequestParam(Constants.USER_ID) long userId){
             return admissionService.acceptAdmissionByStudent(admissionId,userId);
    }

    @GetMapping(Constants.DENY_ADMISSION_BY_STUDENT_URL_MAPPING)
    @ResponseBody
    public String denyAdmissionByStudent(@RequestParam(Constants.ADMISSION_ID) long admissionId){
          return admissionService.denyAdmissionByStudent(admissionId);
    }

    @GetMapping(Constants.GET_ACCEPTED_ADMISSION_BY_STUDENT_URL_MAPPING)
    @ResponseBody
    public GetAllAdmissionRequestDto getAcceptedAdmissionByStudent(@RequestParam(Constants.USER_ID) long userId){
        return admissionService.getAcceptedAdmissionByStudent(userId);
    }

    @GetMapping(Constants.GET_DENIED_ADMISSION_BY_STUDENT_URL_MAPPING)
    @ResponseBody
    public List<GetAllAdmissionRequestDto> getDeniedAdmissionByStudent(@RequestParam(Constants.USER_ID) long userId){
        return admissionService.getDeniedAdmissionByStudent(userId);
    }
}
