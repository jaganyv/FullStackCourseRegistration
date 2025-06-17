package com.org.courseregistrationsystem.service;

import com.org.courseregistrationsystem.model.Course;
import com.org.courseregistrationsystem.model.CourseRegistry;
import com.org.courseregistrationsystem.repository.CourseRegistryRepo;
import com.org.courseregistrationsystem.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo CourseRepo;
    @Autowired
    CourseRegistryRepo courseRegistryRepo;
    public List<Course> availableCourses() {
        return CourseRepo.findAll();

    }

    public List<CourseRegistry> enrolledCourses() {
        return courseRegistryRepo.findAll();
    }

    public void enrolledCourses(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
