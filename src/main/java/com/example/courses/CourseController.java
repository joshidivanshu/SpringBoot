package com.example.courses;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses()
    {
        return Arrays.asList(new Course(1, "Learn Microservices", "Divanshu"));
    }

    @GetMapping("/courses/1")
    public Course getCourse()
    {
        return new Course(2,"Learning Java", "Divanshu");
    }
}
