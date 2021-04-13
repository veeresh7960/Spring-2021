package com.xworkz.applicationinfo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.applicationinfo.constants.ApplicationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="application_data")
public class ApplicationEntity {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="VERSION")
	private double version;
	@Column(name="MEMORY_SIZE")
	private int memorySize;
	@Column(name="DEVELOPED_BY")
	private String developedBy;
	@Column(name="TYPE")
	private ApplicationType type;  
}
