package com.raj.service;

import java.util.List;

import com.raj.entity.DoctorVO;

public interface IDoctorMgmtService {

	String saveDoctor(DoctorVO vo);
	
	List<DoctorVO> showAllDoctors();
	
	DoctorVO showDoctorById(int id);
	
	String editDoctor(DoctorVO vo);
	
	String deleteDoctorById(int id);
}
