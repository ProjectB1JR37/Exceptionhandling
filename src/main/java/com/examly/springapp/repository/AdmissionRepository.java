package com.examly.springapp.repository;
import com.examly.springapp.constants.Constants;
import com.examly.springapp.model.Admission;
import com.examly.springapp.web.dto.GetAllAdmissionRequests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AdmissionRepository extends JpaRepository<Admission,Long> {

    @Query(value = Constants.FIND_BY_USER_ID_QUERY,nativeQuery = true)
    List<Admission> findByUserId(@Param(Constants.USER_ID) long userId);

    @Query(value=Constants.GET_ALL_ADMISSION_REQUESTS_QUERY,nativeQuery = true)
    List<GetAllAdmissionRequests> getAllAdmissionRequests();

    @Modifying
    @Transactional
    @Query(value = Constants.ACCEPT_ADMISSION_QUERY,nativeQuery = true)
    void acceptAdmission(long id);

    @Modifying
    @Transactional
    @Query(value = Constants.DENY_ADMISSION_QUERY,nativeQuery = true)
    void denyAdmission(long id);

    @Query(value=Constants.GET_ALL_ACCEPTED_ADMISSION_QUERY,nativeQuery = true)
    List<GetAllAdmissionRequests> getAllAcceptedAdmission();

    @Query(value=Constants.GET_ALL_DENIED_ADMISSION_QUERY,nativeQuery = true)
    List<GetAllAdmissionRequests> getAllDeniedAdmission();

    @Query(value=Constants.GET_ADMISSION_BY_ID,nativeQuery = true)
    GetAllAdmissionRequests getAdmissionById(long id);

    @Modifying
    @Transactional
    @Query(value = Constants.EDIT_ADMISSION_QUERY,nativeQuery = true)
    void editAdmission(String firstName,String lastName,String email,String mobile,String gender,String fatherName,String motherName,String age,String hscName,long hscMarks,String eligibility,long id);

    @Modifying
    @Transactional
    @Query(value = Constants.DELETE_ADMISSION_QUERY,nativeQuery = true)
    void deleteAdmission(long id);

    @Modifying
    @Transactional
    @Query(value = Constants.ACCEPT_ADMISSION_BY_STUDENT_QUERY,nativeQuery = true)
    void acceptAdmissionByStudent(long admissionId);

    @Modifying
    @Transactional
    @Query(value = Constants.DENY_ADMISSION_BY_STUDENT_QUERY,nativeQuery = true)
    void denyAdmissionByStudent(long admissionId);

    @Modifying
    @Transactional
    @Query(value =Constants.DENY_ALL_ADMISSION_QUERY,nativeQuery = true )
    void denyAllAdmission(long userId);

    @Query(value =Constants.GET_ACCEPTED_ADMISSION_BY_STUDENT_QUERY,nativeQuery = true)
    GetAllAdmissionRequests getAcceptedAdmissionByStudent(long userId);

    @Query(value =Constants.GET_DENIED_ADMISSION_BY_STUDENT_QUERY,nativeQuery = true)
    List<GetAllAdmissionRequests> getDeniedAdmissionByStudent(long userId);

    @Query(value = Constants.COUNT_ACCEPTED_ADMISSION_QUERY,nativeQuery = true)
    int countAcceptedAdmission(long userId);
}
