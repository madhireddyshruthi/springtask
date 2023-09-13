package com.example.Student.model;

import jakarta.annotation.Nonnull;

public class StudentVo {
	@Nonnull
	private int studentId;
	@Nonnull
	private String studentName;

	public StudentVo() {
		super();
	}
	public StudentVo(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
