package com.ample.util;

import java.util.Date;

public class Driver {
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getVechiletype() {
		return vechiletype;
	}
	public void setVechiletype(String vechiletype) {
		this.vechiletype = vechiletype;
	}
	public String getVechilenumber() {
		return vechilenumber;
	}
	public void setVechilenumber(String vechilenumber) {
		this.vechilenumber = vechilenumber;
	}
	public int getPeopleincabnow() {
		return peopleincabnow;
	}
	public void setPeopleincabnow(int peopleincabnow) {
		this.peopleincabnow = peopleincabnow;
	}
	public int getMaxseatincab() {
		return maxseatincab;
	}
	public void setMaxseatincab(int maxseatincab) {
		this.maxseatincab = maxseatincab;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String  drivername;
	private String mobilenumber;
	private String vechiletype;
	private String vechilenumber;
	private int   peopleincabnow;
	private int   maxseatincab;
	private String   source;
	private String   destination;
	private Date  starttime;
	private String  latitude;
	private String longitude;
	private String location;
	private String password;
	  
}
