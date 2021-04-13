package com.xworkz.applicationinfo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="mineral_data")
public class MineralEntity {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "SOLUBILITY")
	private String solubility;
	@Column(name = "HARDNESS")
	private int hardNess;
	@Column(name = "MAGNETIC")
	private boolean magenic;
	
}