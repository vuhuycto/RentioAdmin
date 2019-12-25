package models;

import java.util.Map;

public class User {
	private String ID;
	private String firstName;
	private String lastName;
	private String gender;
	private String birthday;
	private String email;
	private String username;
	private String password;
	private String phone;
	private String address;
	private String job;
	private String freeTrialStart;
	private String freeTrialEnd;
	
	public User(Map<String, String> userFromDB) {
		this.ID = userFromDB.get("id");
		this.firstName = userFromDB.get("first_name");
		this.lastName = userFromDB.get("last_name");
		this.gender = userFromDB.get("gender");
		this.birthday = userFromDB.get("birthday");
		this.email = userFromDB.get("email");
		this.username = userFromDB.get("username");
		this.password = userFromDB.get("password");
		this.phone = userFromDB.get("phone");
		this.address = userFromDB.get("address");
		this.job = userFromDB.get("job");
		this.freeTrialStart = userFromDB.get("free_trial_start");
		this.freeTrialEnd = userFromDB.get("free_trial_end");
	}

	public String toString() {
		return this.ID + ": " + this.username;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getFreeTrialStart() {
		return freeTrialStart;
	}

	public void setFreeTrialStart(String freeTrialStart) {
		this.freeTrialStart = freeTrialStart;
	}

	public String getFreeTrialEnd() {
		return freeTrialEnd;
	}

	public void setFreeTrialEnd(String freeTrialEnd) {
		this.freeTrialEnd = freeTrialEnd;
	}
}
