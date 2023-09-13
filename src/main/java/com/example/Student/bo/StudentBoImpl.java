package com.example.Student.bo;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.eo.StudentEo;
import com.example.Student.exception.ResourceNotFoundException;
import com.example.Student.model.HealthCheck;
import com.example.Student.model.StudentDto;
@Service
public class StudentBoImpl implements StudentBo{
	@Autowired
	private StudentEo studentEo;
	Logger logger = LoggerFactory.getLogger(StudentBoImpl.class);
	@Override
	public List<StudentDto> getStudentDto() {
		logger.info("retrieving student details");
		return studentEo.getStudentDto();
	}
	@Override
	public StudentDto saveStudentDto(StudentDto studentDto) {
		logger.info("saving the student details");
		return studentEo.saveStudentDto(studentDto);
	}
//	@Override
//	
//	public HealthCheck healthcheck() throws ResourceNotFoundException {
//	    HealthCheck healthcheck = new HealthCheck();
//	    healthcheck.setHealthComment("Check table is available in db");
//
//	    try {
//	        List<StudentDto> studentDtos = getStudentDto();
//	        if (studentDtos != null && !studentDtos.isEmpty()) {
//	            for (StudentDto studentDto : studentDtos) {
//	                if (Objects.equals(studentDto.getStudentId(), null)) {
//	                    throw new ResourceNotFoundException("Student ID is null");
//	                }
//	            }
//	            healthcheck.setHealthStatus("Success");
//	            healthcheck.setHealthDescription("Student is available");
//	        } else {
//	            healthcheck.setHealthDescription("Student is empty");
//	        }
//	    } catch (ResourceNotFoundException e) {
//	        healthcheck.setHealthStatus("Failure");
//	        healthcheck.setHealthDescription("Resource is not available");
//	        throw e; 
//	    } catch (Exception e) {
//	        healthcheck.setHealthStatus("Failure");
//	        healthcheck.setHealthDescription("Resource is not available");
//	    }
//
//	    return healthcheck;
//	}
	@Override
	public HealthCheck healthcheck() {
		logger.info("Healthcheck in progress");
		return studentEo.healthcheck();
	
	}
}



