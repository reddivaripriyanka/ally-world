package com.app.allyworld.AllyWebSite.entity;

public class Profile {
	/* private int profileId; */
	private String userName;
	private String fullName;
	private String gender;
	private String dateOfBirth;
	private Long phoneNumber;
	private String relationShipStatus;
	private String currentAddress;
	private String permanentAddress;
	/*
	 * private static int profileIdGenerator;
	 * 
	 * static { profileIdGenerator = 100; } { profileId = profileIdGenerator++; }
	 */

	@Override
	public String toString() {
		return "Profile [ userName=" + userName + ", fullName=" + fullName + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", phoneNumber=" + phoneNumber + ", relationShipStatus=" + relationShipStatus
				+ ", currentAddress=" + currentAddress + ", permanentAddress=" + permanentAddress + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRelationShipStatus() {
		return relationShipStatus;
	}

	public void setRelationShipStatus(String relationShipStatus) {
		this.relationShipStatus = relationShipStatus;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Profile() {
		super();
	}

	public Profile(String userName, String fullName, String gender, String dateOfBirth, Long phoneNumber,
			String relationShipStatus, String currentAddress, String permanentAddress) {
		super();
		
		this.userName = userName;
		this.fullName = fullName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.relationShipStatus = relationShipStatus;
		this.currentAddress = currentAddress;
		this.permanentAddress = permanentAddress;
	}

}
