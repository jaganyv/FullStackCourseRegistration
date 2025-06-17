package com.org.courseregistrationsystem.controller;

import com.org.courseregistrationsystem.model.Course;
import com.org.courseregistrationsystem.model.CourseRegistry;
import com.org.courseregistrationsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5500/")
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> availableCourses() {
     return courseService.availableCourses();
    }
    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledCourses() {
        return courseService.enrolledCourses();
    }
    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,@RequestParam("emailId") String emailId,@RequestParam("courseName") String courseName) {
        courseService.enrolledCourses(name,emailId,courseName);
        return "Congratulations! "+name+" Enrolled! For the Course Of "+courseName ;

    }
}
