package com.raj.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "MP_DOCTOR")
@Entity
public class DoctorEntity implements Serializable {

	//Data Properties
	@SequenceGenerator(name = "gen1", sequenceName = "DID_SEQ", initialValue = 1001, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Id
	private Integer id;
	
	@NonNull
	@Column(length = 30)
	private String name;
	
	@NonNull
	@Column(length = 30)
	private String addrs;
	
	@NonNull
	@Column(length = 30)
	private String specialization;
	
	@NonNull
	private Double fee;
	
	//Meta Data Properties
	@Column(length = 30)
	private String createdBy;
	
	@Column(length = 30)
	private String updatedBy;
	
	@CreationTimestamp
	@Column(insertable = true, updatable = false)
	private LocalDateTime registeredOn;
	
	@UpdateTimestamp
	@Column(insertable = false, updatable = true)
	private LocalDateTime updatedOn;
	
	@Version
	private Integer updateCount;
		
}
