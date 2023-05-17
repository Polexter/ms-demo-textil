package com.demo.textil.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_BRAND")
@Data
@NoArgsConstructor
public class BrandEntity {

	
	@Id
	@Column(name = "NU_ID")
	private Long id;
	
	@Column(name = "TX_DESCRIPTION")
	private String description;
	
}
