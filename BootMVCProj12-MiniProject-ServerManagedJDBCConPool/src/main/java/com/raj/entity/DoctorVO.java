package com.raj.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class DoctorVO implements Serializable {

	private Integer id;

	@NonNull
	private String name;

	@NonNull
	private String addrs;

	@NonNull
	private String specialization;

	@NonNull
	private Double fee;

	private Double netFee;	
	
}
