package com.ojt.studentcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private List<String> courses;

    @GetMapping("/courses")
    public String showCourses(Model model) {

        model.addAttribute("courses", courses);

        return "courses";

    }

}