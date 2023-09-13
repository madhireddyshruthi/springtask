package com.example.Student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Student.model.HealthCheck;
import com.example.Student.model.StudentVo;

	public interface StudentService {
		 public List<StudentVo> getStudentVo();
		 public StudentVo saveStudentVo(StudentVo studentVo);
		 public HealthCheck healthcheck();

}
