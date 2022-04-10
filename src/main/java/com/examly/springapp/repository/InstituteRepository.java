package com.examly.springapp.repository;
import com.examly.springapp.constants.Constants;
import com.examly.springapp.model.Institute;
import com.examly.springapp.web.dto.InstituteSaveDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface InstituteRepository extends JpaRepository<Institute,Long> {

    Institute findByInstituteId(long id);

    @Query(value =Constants.GET_ALL_INSTITUTE_QUERY ,nativeQuery = true)
    List<Institute> getAllInstitute();

    @Modifying
    @Transactional
    @Query(value = Constants.EDIT_INSTITUTE_BY_ID_QUERY,nativeQuery = true)
    void editInstituteById(long instituteId,String instituteName, String instituteDescription, String instituteCity, String instituteState, String instituteEmail, String instituteMobile, int nirfRank);

    @Modifying
    @Transactional
    @Query(value = Constants.DELETE_INSTITUTE_BY_ID_QUERY,nativeQuery = true)
    void deleteInstituteById(@Param(Constants.ID) long id);
}
