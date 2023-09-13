package com.example.Student.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Student.bo.StudentBo;
import com.example.Student.mapper.StudentMapper;
import com.example.Student.model.HealthCheck;
import com.example.Student.model.StudentVo;


	@Service
	@Component
	public class StudentServiceImpl implements StudentService {

		@Autowired
		private StudentBo studentBo;
		@Autowired
		private StudentMapper studentMapper;
		Logger logger= LoggerFactory.getLogger(StudentServiceImpl.class);
	    @Override
		public List<StudentVo> getStudentVo() {
			logger.info("Retrieving data");
			return studentMapper.toStudentVos(studentBo.getStudentDto());
		}
		@Override
		public StudentVo saveStudentVo(StudentVo student) {
		
			logger.info("Saving Student");
			return studentMapper.toStudentVo(studentBo.saveStudentDto(studentMapper.toStudentDto(student)));
		}
		
		@Override
		public HealthCheck healthcheck() {
			logger.info("Healthcheck in progress");
			return studentBo.healthcheck();
		}
}
