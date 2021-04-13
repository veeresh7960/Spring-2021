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
@Table(name = "virus_data")
public class VirusEntity {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SHAPE")
	private String shape;
	@Column(name = "SCIENTFIC_NAME")
	private String scientificName;
	@Column(name = "SIZE")
	private int size;
	@Column(name = "RESISTANCE")
	private String resistance;
	@Column(name = "METOBOLISM")
	private String metobolism;

}
