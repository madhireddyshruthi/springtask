package com.example.Student.model;

public class HealthCheck {
	String healthComment;
	String healthStatus;
	String healthDescription;
	public HealthCheck() {
		super();
	}
	public HealthCheck(String healthComment, String healthStatus, String healthDescription) {
		super();
		this.healthComment = healthComment;
		this.healthStatus = healthStatus;
		this.healthDescription = healthDescription;
	}
	public String getHealthComment() {
		return healthComment;
	}
	public void setHealthComment(String healthComment) {
		this.healthComment = healthComment;
	}
	public String getHealthStatus() {
		return healthStatus;
	}
	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}
	public String getHealthDescription() {
		return healthDescription;
	}
	public void setHealthDescription(String healthDescription) {
		this.healthDescription = healthDescription;
	}

}
