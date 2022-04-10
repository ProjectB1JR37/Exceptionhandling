package com.examly.springapp.repository;

import com.examly.springapp.model.Address;
import com.examly.springapp.constants.Constants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface AddressRepository extends JpaRepository<Address,Long> {

    @Query(value =Constants.FIND_BY_ADMISSION_ID_QUERY,nativeQuery = true)
    Address findByAdmissionId(long id);

    @Modifying
    @Transactional
    @Query(value = Constants.EDIT_ADDRESS_QUERY,nativeQuery = true)
    void editAddress(String houseNumber,String streetNumber,String areaName,String state,String pinCode,String nationality,long id);


}
