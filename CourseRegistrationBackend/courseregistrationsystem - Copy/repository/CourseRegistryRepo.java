package com.org.courseregistrationsystem.repository;

import com.org.courseregistrationsystem.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry, Integer> {

}
