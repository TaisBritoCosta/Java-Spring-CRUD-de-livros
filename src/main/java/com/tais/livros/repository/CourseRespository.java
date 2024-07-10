package com.tais.livros.repository;

import com.tais.livros.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRespository extends JpaRepository<Course, Long>{
}
