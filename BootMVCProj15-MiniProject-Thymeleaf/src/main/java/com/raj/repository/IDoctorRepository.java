package com.raj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.entity.DoctorEntity;

public interface IDoctorRepository extends JpaRepository<DoctorEntity, Integer> {

}
