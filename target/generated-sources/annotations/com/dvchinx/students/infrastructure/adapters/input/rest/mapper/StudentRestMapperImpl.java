package com.dvchinx.students.infrastructure.adapters.input.rest.mapper;

import com.dvchinx.students.domain.model.Student;
import com.dvchinx.students.infrastructure.adapters.input.rest.model.request.StudentCreateRequest;
import com.dvchinx.students.infrastructure.adapters.input.rest.model.response.StudentResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-09T15:36:10-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.5 (Amazon.com Inc.)"
)
@Component
public class StudentRestMapperImpl implements StudentRestMapper {

    @Override
    public Student toStudent(StudentCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        Student.StudentBuilder student = Student.builder();

        student.firstname( request.getFirstname() );
        student.lastname( request.getLastname() );
        student.age( request.getAge() );
        student.address( request.getAddress() );

        return student.build();
    }

    @Override
    public StudentResponse toStudentResponse(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentResponse.StudentResponseBuilder studentResponse = StudentResponse.builder();

        studentResponse.id( student.getId() );
        studentResponse.firstname( student.getFirstname() );
        studentResponse.lastname( student.getLastname() );
        studentResponse.age( student.getAge() );
        studentResponse.address( student.getAddress() );

        return studentResponse.build();
    }

    @Override
    public List<StudentResponse> toStudentResponseList(List<Student> studentList) {
        if ( studentList == null ) {
            return null;
        }

        List<StudentResponse> list = new ArrayList<StudentResponse>( studentList.size() );
        for ( Student student : studentList ) {
            list.add( toStudentResponse( student ) );
        }

        return list;
    }
}
