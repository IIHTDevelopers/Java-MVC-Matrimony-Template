package com.yaksha.training.matrimony.entity;

public class Matrimony {

	private Long id;

	private String fullName;

	private Gender gender;

	private String address;

	private String religion;

	private String occupation;

	private String hobbies;

	private Boolean is_match_found = false;

	public Matrimony() {
	}

	public Matrimony(Long id, String fullName, Gender gender, String address, String religion, String occupation,
			String hobbies) {
		this.id = id;
		this.fullName = fullName;
		this.gender = gender;
		this.address = address;
		this.religion = religion;
		this.occupation = occupation;
		this.hobbies = hobbies;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public Boolean getIs_match_found() {
		return is_match_found;
	}

	public void setIs_match_found(Boolean is_match_found) {
		this.is_match_found = is_match_found;
	}

	@Override
	public String toString() {
		return "Matrimony{" + "id=" + id + ", fullName='" + fullName + '\'' + ", gender='" + gender + '\''
				+ ", address='" + address + '\'' + ", religion='" + religion + '\'' + ", occupation='" + occupation
				+ '\'' + ", hobbies='" + hobbies + '\'' + '}';
	}
}
