package com.example.Student.bo;

import java.util.List;

import com.example.Student.exception.ResourceNotFoundException;
import com.example.Student.model.HealthCheck;
import com.example.Student.model.StudentDto;

public interface StudentBo {
	public List<StudentDto> getStudentDto();
	public StudentDto saveStudentDto(StudentDto studentDto);
	public HealthCheck healthcheck();
	

}
