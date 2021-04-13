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
@Table(name = "place_data")
public class HistoricalPlaceEntity {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "NO_OF_VISITORS")
	private int noOfVisitors;
	@Column(name = "SPECIAL_THING")
	private String SpecialThing;
	@Column(name = "STATE")
	private String state;
}
