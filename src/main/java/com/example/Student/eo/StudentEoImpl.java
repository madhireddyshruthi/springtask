package com.example.Student.eo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Student.dao.StudentDao;
import com.example.Student.model.HealthCheck;
import com.example.Student.model.StudentDto;


@Service
public class StudentEoImpl implements StudentEo {
	@Autowired
	private StudentDao studentDao;
	Logger logger = LoggerFactory.getLogger( StudentEo.class);
	@Override
	public List< StudentDto> getStudentDto() {
		logger.info("Retrieving data");
		return studentDao.getStudentDto();
	}
@Override
	public  StudentDto saveStudentDto(StudentDto studentDto) {
		logger.info("Save student");
		return studentDao.saveStudentDto(studentDto);
	}
@Override
public HealthCheck healthcheck() {
	logger.info("Healthcheck in progress");
	return studentDao.healthcheck();
}
	
}


