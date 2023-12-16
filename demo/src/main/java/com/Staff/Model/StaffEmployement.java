package com.Staff.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StaffEmployement {

	@Id
    private String staffCode;
    private String staffName;
    private String companyCode;
    private String companyName;
    private String shipCode;
    private String shipName;
    private String callSign;
    private String employmentType;
    private String dept;
    private String title;
    private String position;
    private String functionality;
    private int telephoneNo;
    private int mobileNo;
    private String email;
    private String website;
    private String remarks;

    // Constructors, getters, and setters


    public StaffEmployement(String staffCode, String staffName, String companyCode, String companyName,
            String shipCode, String shipName, String callSign, String employmentType,
            String dept, String title, String position, String functionality,
            int telephoneNo, int mobileNo, String email, String website, String remarks) {
    	
        this.staffCode = staffCode;
        this.staffName = staffName;
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.shipCode = shipCode;
        this.shipName = shipName;
        this.callSign = callSign;
        this.employmentType = employmentType;
        this.dept = dept;
        this.title = title;
        this.position = position;
        this.functionality = functionality;
        this.telephoneNo = telephoneNo;
        this.mobileNo = mobileNo;
        this.email = email;
        this.website = website;
        this.remarks = remarks;
    }
 
    //getters and Setters
	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getCallSign() {
		return callSign;
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String function) {
		this.functionality = function;
	}

	public int getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(int telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	//to string
	@Override
	public String toString() {
		return "StaffEmployement [staffCode=" + staffCode + ", staffName=" + staffName + ", companyCode=" + companyCode
				+ ", companyName=" + companyName + ", shipCode=" + shipCode + ", shipName=" + shipName + ", callSign="
				+ callSign + ", employmentType=" + employmentType + ", dept=" + dept + ", title=" + title
				+ ", position=" + position + ", functionality=" + functionality + ", telephoneNo=" + telephoneNo + ", mobileNo="
				+ mobileNo + ", email=" + email + ", website=" + website + ", remarks=" + remarks + "]";
	}

   
    
    
}