package com.examly.springapp.service;

import com.examly.springapp.model.Institute;
import com.examly.springapp.web.dto.InstituteSaveDto;

import java.util.List;

public interface InstituteService {

    Institute saveInstitute(InstituteSaveDto instituteSaveDto);

    List<Institute> getAllInstitutes();

    Institute getInstituteById(long id);

    void editInstitute(long id,InstituteSaveDto dto);

    void deleteInstitute(long id);
}
