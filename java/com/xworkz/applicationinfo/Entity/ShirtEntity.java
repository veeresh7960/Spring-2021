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
@Table(name = "shirt_data")
public class ShirtEntity {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "SIZE")
	private int size;
	@Column(name = "MATIREAL_TYPE")
	private String matirealType;
	@Column(name = "BRAND_NAME")
	private String brandName;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "DICOUNT")
	private double discount;

}
