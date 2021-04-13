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
@Table(name = "tvchannel_data")
public class TvChannelEntity {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "CHANNEL_NO")
	private int channelNo;
	@Column(name = "PROGRAM")
	private String program;
	@Column(name = "RECHARGE")
	private boolean recharge;
	@Column(name = "OWNER_NAME")
	private String ownerName;
	@Column(name = "QUALITY")
	private String quality;
}
