package com.endproject.lopputyo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface ICourseService {

    @RestController
    public class HelloWorld{
        @RequestMapping("/")
        public String hello(){
            return "Hello user kappa 123";
        }
    }
    
    List<Student> getStudents();

    List<Course> getCourse();

    Student getStudentById(long studentId);

    Course getCourseById(long courseId);

    List<Course> getCourseOfStudent(long studentId);

    boolean addStudentToCourse(long studentId, long courseId);
}
