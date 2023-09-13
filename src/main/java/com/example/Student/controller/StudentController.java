package com.example.Student.controller;

import java.util.List;

import org.bouncycastle.est.ESTService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.Student.model.HealthCheck;
import com.example.Student.model.StudentVo;
import com.example.Student.service.StudentService;
import com.example.Student.service.StudentServiceImpl;

@RestController
@RequestMapping("/students")

public class StudentController {
	@Autowired 
	StudentService studentService;
		Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
		
		@GetMapping("/get")
		public ResponseEntity<List<StudentVo>> getStudentVo() {
		    List<StudentVo> studentVo = studentService.getStudentVo();
		    logger.info("Data of student details is retrieving");
		    return ResponseEntity.ok(studentVo);
		}
		@PostMapping("/post")
		public ResponseEntity<StudentVo> saveStudentVo(@Validated @RequestBody StudentVo studentVo){
			StudentVo studentVos=studentService.saveStudentVo(studentVo);
			if(studentVos==null)
				return new ResponseEntity("Insertion Error", HttpStatus.BAD_REQUEST);
			logger.info("Data is saving");
			return ResponseEntity.status(HttpStatus.OK).body(studentVos);
		}
		@GetMapping("/healthcheck")
		public ResponseEntity<HealthCheck> healthcheck(){
			HealthCheck healthcheck= studentService.healthcheck();
			logger.info("Data is saving in db");
			return ResponseEntity.status(HttpStatus.OK).body(healthcheck);
		}	
	    

}
