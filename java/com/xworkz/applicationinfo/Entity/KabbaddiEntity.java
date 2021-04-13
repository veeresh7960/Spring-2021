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
@Table(name="kabbaddi_data")
public class KabbaddiEntity {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="TYPE")
	private ApplicationType type;
	@Column(name = "LOCATION")
	private String loaction;
	@Column(name = "NO_OF_PLAYERS")
	private int noOfPlayers;
	@Column(name = "STATE")
	private String state;

}
