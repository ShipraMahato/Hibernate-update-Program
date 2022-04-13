package com.edu;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //create table Student
public class Employee {
	@Id   //primary key
private int eid;
private String ename;
private String address;
//generate setter and getter method 
//generate toString
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
@Override
public String toString() {
	return "Employee [employee id=" + eid + ", employee name=" + ename + ", employee  Address=" + address + "]";

	}

}
