package com.examly.springapp.service;

import com.examly.springapp.model.Institute;
import com.examly.springapp.repository.InstituteRepository;
import com.examly.springapp.web.dto.InstituteSaveDto;


import exception.ResourceNotFound;
import com.examly.springapp.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituteServiceImpl implements InstituteService{
    @Autowired
    InstituteRepository instituteRepository;
    @Override
    public Institute saveInstitute(InstituteSaveDto dto) {

        Institute institute = new Institute(dto.getInstituteName(), dto.getInstituteDescription(),
                dto.getInstituteCity(),dto.getInstituteState(),dto.getInstituteEmail(),
                dto.getInstituteMobile(), dto.getNirfRank());
        
        
       
        	if(dto.getInstituteName().isEmpty()||dto.getInstituteDescription().isEmpty()||
        			 dto.getInstituteCity().isEmpty()||dto.getInstituteState().isEmpty()||
        			 dto.getInstituteEmail().isEmpty()||
                     dto.getInstituteMobile().isEmpty()) {
        		throw new  ResourceNotFound(Constants.INSTITUTE_FIELDS_EMPTY);
        	
        	}
        	
       Institute t= instituteRepository.save(institute);
        
        return t;
    }
        

    
    @Override
    public List<Institute> getAllInstitutes() {
    	List<Institute> list=null;
        list= instituteRepository.getAllInstitute();
        if(list.isEmpty()) {
       	 throw new ResourceNotFound(Constants.INSTITUTE_LIST_EMPTY);
        }
       	return list; 

    }

    @Override
    public Institute getInstituteById(long id) {
    	if(instituteRepository.findByInstituteId(id)==null) {
    		throw new ResourceNotFound(Constants.INSTITUTE_NOT_FOUND);
    	}
        return instituteRepository.findByInstituteId(id);
    }

    @Override
    public void editInstitute(long id,InstituteSaveDto dto) {
    	
    	if(instituteRepository.findByInstituteId(id)==null) {
    		throw new ResourceNotFound(Constants. INSTITUTE_NOT_FOUND);
    	}
    	if(dto.getInstituteName().isEmpty()||dto.getInstituteDescription().isEmpty()||
   			 dto.getInstituteCity().isEmpty()||dto.getInstituteState().isEmpty()||
   			 dto.getInstituteEmail().isEmpty()||
                dto.getInstituteMobile().isEmpty()) {
   		throw new  ResourceNotFound(Constants.INSTITUTE_FIELDS_EMPTY);
   	
   	}
        instituteRepository.editInstituteById(id,dto.getInstituteName(),dto.getInstituteDescription(),
                dto.getInstituteCity(),dto.getInstituteState(),dto.getInstituteEmail(),
                dto.getInstituteMobile(),dto.getNirfRank());
    }

    @Override
    public void deleteInstitute(long id) {
    	if(instituteRepository.findByInstituteId(id)==null)
    		throw new ResourceNotFound(Constants.INSTITUTE_NOT_FOUND_TO_DELETE);
    	
        instituteRepository.deleteInstituteById(id);
        	   
    }

}
