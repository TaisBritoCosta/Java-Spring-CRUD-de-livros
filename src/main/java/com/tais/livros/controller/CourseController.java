package com.tais.livros.controller;

import com.tais.livros.model.Course;
import com.tais.livros.repository.CourseRespository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRespository courseRepository;

    @GetMapping
    public List<Course> lista() {
        return courseRepository.findAll();
    }
}
