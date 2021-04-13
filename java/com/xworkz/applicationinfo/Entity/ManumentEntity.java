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
@Table(name="manument_data")
public class ManumentEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name = "LOCATION")
	private String loaction;
	@Column(name = "BUILT_BY")
	private String builtBy;
	@Column(name = "YEAR_OF_BUILT")
	private int yearOfBuilt;
	@Column(name = "HEIGHT")
	private int height;
	
	
}
