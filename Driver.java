package com.demo.db;

import java.util.Date;

public class Driver {
 private int id;
	private Integer   maxseatincab;
	 private String  source;
	private String destination;
	private String starttime;
	private String latitude;
	private String  longitude;
	private String  location;
	  private String password;
	  private Integer   peopleincabnow;
		private String  drivername;
		private String	mobilenumber;
		private String  vechiletype;
		private String  vechilenumber;
		
	public int getId() {
	return id;
}
public void setId(int id) {
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






	public Integer getPeopleincabnow() {
		return peopleincabnow;
	}
	public void setPeopleincabnow(Integer peopleincabnow) {
		this.peopleincabnow = peopleincabnow;
	}
	public Integer getMaxseatincab() {
		return maxseatincab;
	}
	public void setMaxseatincab(Integer maxseatincab) {
		this.maxseatincab = maxseatincab;
	}


	
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}




	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
