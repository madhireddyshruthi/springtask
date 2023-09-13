package com.example.Student.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.Student.model.StudentDto;
import com.example.Student.model.StudentVo;

@Mapper(componentModel = "Spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)


public interface StudentMapper {
	

		public StudentDto toStudentDto(StudentVo student);

		public StudentVo toStudentVo(StudentDto saveStudentDto);

		public List<StudentVo> toStudentVos(List<StudentDto> studentDto);

		List<StudentDto> toStudentDtos(List<StudentVo> list);
	}


