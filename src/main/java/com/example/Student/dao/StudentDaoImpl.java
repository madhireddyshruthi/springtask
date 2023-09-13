package com.example.Student.dao;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Student.exception.ResourceNotFoundException;
import com.example.Student.model.HealthCheck;
import com.example.Student.model.StudentDto;
//@Repository
//public class StudentDaoImpl implements StudentDao {
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	Logger logger = LoggerFactory.getLogger(StudentDao.class);
//	
//	@Override
//	public StudentDto saveStudentDto(StudentDto studentDto) {
//	    String insertQuery = "INSERT INTO studentVo (studentId, studentName) VALUES (?, ?)";
//	    jdbcTemplate.update(insertQuery, studentDto.getStudentId(), studentDto.getStudentName());
//	    logger.info("Inserting data into the student table");
//	    return studentDto;
//	}
//
//	
//	@Override
//	public List<StudentDto> getStudentDto() {
//		
//		String sql = "select*from studentVo";
//		logger.info("Find all the data");
//        List<StudentDto> studentDto = jdbcTemplate.query(sql,
//                new BeanPropertyRowMapper<StudentDto>(StudentDto.class));
//        return studentDto;
//	
//	
//	}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    Logger logger = LoggerFactory.getLogger(StudentDao.class);

    @Override
    public StudentDto saveStudentDto(StudentDto studentDto) {
        String insertQuery = "INSERT INTO student (studentId, studentName) VALUES (?, ?)";
        jdbcTemplate.update(insertQuery, studentDto.getStudentId(), studentDto.getStudentName());
        logger.info("Inserting data into the student table");
        return studentDto;
    }

    @Override
    public List<StudentDto> getStudentDto() {
        String sql = "SELECT * FROM student";
        logger.info("Find all the data");
        List<StudentDto> studentDto = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(StudentDto.class));
        return studentDto;
    }
    public HealthCheck healthcheck() {
        HealthCheck healthcheck = new HealthCheck();
        healthcheck.setHealthComment("Check table is available in db");

        try {
            // Perform a query to check the existence of the studentVo table
            String sql = "SELECT COUNT(*) FROM student";
            int rowCount = jdbcTemplate.queryForObject(sql, Integer.class);

            if (rowCount > 0) {
                healthcheck.setHealthStatus("Success");
                healthcheck.setHealthDescription("Student table is available");
            } else {
                healthcheck.setHealthStatus("Failure");
                healthcheck.setHealthDescription("Student table is empty");
            }
        } catch (Exception e) {
            healthcheck.setHealthStatus("Failure");
            healthcheck.setHealthDescription("Resource is not available: " + e.getMessage());
        }

        return healthcheck;
}
}