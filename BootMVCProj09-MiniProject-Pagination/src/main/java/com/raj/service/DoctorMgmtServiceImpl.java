package com.raj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.raj.entity.DoctorEntity;
import com.raj.entity.DoctorVO;
import com.raj.exception.DoctorNotFoundException;
import com.raj.repository.IDoctorRepository;

@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService{

	@Autowired
	private IDoctorRepository doctorRepo;

	@Override
	public String saveDoctor(DoctorVO vo) {

		//convert vo to Entity
		DoctorEntity entity = new DoctorEntity();
		BeanUtils.copyProperties(vo, entity);
		entity.setCreatedBy(System.getProperty("user.name"));

		//save the object
		Integer idVal = doctorRepo.save(entity).getId();

		return "Doctor is saved with id value:: "+idVal;
	}

	@Override
	public List<DoctorVO> showAllDoctors() {

		//use repo
		List<DoctorEntity> listEntity = doctorRepo.findAll();

		//convert listEntities to listVO
		List<DoctorVO> listVO = new ArrayList<DoctorVO>();

		listEntity.forEach(entity->{
			DoctorVO vo = new DoctorVO();
			BeanUtils.copyProperties(entity, vo);
			vo.setNetFee(vo.getFee()+vo.getFee()*0.18);
			listVO.add(vo);
		});

		return listVO;
	}

	@Override
	public DoctorVO showDoctorById(int id) {
		//load object
		DoctorEntity entity = doctorRepo.findById(id).orElseThrow(()->new DoctorNotFoundException("Invalid Doctor Id"));

		//convert entity to vo object
		DoctorVO vo = new DoctorVO();
		BeanUtils.copyProperties(entity, vo);

		return vo;
	}

	@Override
	public String editDoctor(DoctorVO vo) {

		//check the record availability
		DoctorEntity entity = doctorRepo.findById(vo.getId()).orElseThrow(()->new DoctorNotFoundException("Invalid Doctor Id"));

		//convert VO object to Entity object
		BeanUtils.copyProperties(vo, entity);
		entity.setUpdatedBy(System.getProperty("user.name"));

		//updated object
		doctorRepo.save(entity);

		return vo.getId()+" Doctor Details are Updated";
	}

	@Override
	public String deleteDoctorById(int id) {

		//check the record availability
		boolean flag = doctorRepo.existsById(id);

		if(flag) {
			doctorRepo.deleteById(id);
			return id+" Doctor Found and Deleted";
		}

		return id+" Doctor not Found and not Deleted";
	}



	@Override
	public Page<DoctorVO> showDoctorsByPagination(Pageable pageable) {
		//use  repo
		Page<DoctorEntity> page = doctorRepo.findAll(pageable);
		//get List Entity object from page object
		List<DoctorEntity> listEntity = page.getContent();
		//convert listEntity to listVO
		List<DoctorVO> listVO = new ArrayList<>();

		listEntity.forEach(entity->{
			DoctorVO vo = new DoctorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});

		//Create Page obj having listVO
		Page<DoctorVO> pageVO = new PageImpl<DoctorVO>(listVO, pageable, doctorRepo.count());

		return pageVO;	
	}	
}
