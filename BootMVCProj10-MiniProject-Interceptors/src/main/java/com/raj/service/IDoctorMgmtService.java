package com.raj.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.raj.entity.DoctorVO;

public interface IDoctorMgmtService {

	String saveDoctor(DoctorVO vo);
	
	List<DoctorVO> showAllDoctors();
	
	DoctorVO showDoctorById(int id);
	
	String editDoctor(DoctorVO vo);
	
	String deleteDoctorById(int id);
	
    Page<DoctorVO> showDoctorsByPagination(Pageable pageable);
}
