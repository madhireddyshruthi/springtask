package com.example.Student.mapper;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import org.springframework.stereotype.Component;

import com.example.Student.model.StudentDto;
import com.example.Student.model.StudentVo;


	@Generated(
		    value = "org.mapstruct.ap.MappingProcessor",
		    date = "2023-08-23T11:51:46+0530",
		    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 17.0.6 (Oracle Corporation)"
		)
		@Component
		public class StudentMapperImpl implements StudentMapper {

		    @Override
		    public StudentDto toStudentDto(StudentVo student) {
		        if ( student == null ) {
		            return null;
		        }

		        StudentDto studentDto = new StudentDto();

		        studentDto.setStudentId( student.getStudentId() );
		        studentDto.setStudentName( student.getStudentName() );

		        return studentDto;
		    }

		    @Override
		    public StudentVo toStudentVo(StudentDto saveStudentDto) {
		        if ( saveStudentDto == null ) {
		            return null;
		        }

		        StudentVo studentVo = new StudentVo();

		        studentVo.setStudentId( saveStudentDto.getStudentId() );
		        studentVo.setStudentName( saveStudentDto.getStudentName() );

		        return studentVo;
		    }

		    @Override
		    public List<StudentVo> toStudentVos(List<StudentDto> studentDto) {
		        if ( studentDto == null ) {
		            return null;
		        }

		        List<StudentVo> list = new ArrayList<StudentVo>(studentDto.size() );
		        for ( StudentDto studentDto1 : studentDto ) {
		            list.add( toStudentVo( studentDto1 ) );
		        }

		        return list;
		    }

		    @Override
		    public List<StudentDto> toStudentDtos(List<StudentVo> list) {
		        if ( list == null ) {
		            return null;
		        }

		        List<StudentDto> list1 = new ArrayList<StudentDto>( list.size() );
		        for ( StudentVo studentVo : list ) {
		            list1.add( toStudentDto( studentVo ) );
		        }

		        return list1;
		    }

}
