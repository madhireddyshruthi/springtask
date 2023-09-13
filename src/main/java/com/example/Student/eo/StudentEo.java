package com.example.Student.eo;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Student.model.HealthCheck;
import com.example.Student.model.StudentDto;
@Component
public interface StudentEo {
	public List<StudentDto> getStudentDto();
	public StudentDto saveStudentDto(StudentDto studentDto);
	public HealthCheck healthcheck();

}
