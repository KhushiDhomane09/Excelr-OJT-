package com.ojt.studentcrud.controller;

import com.ojt.studentcrud.entity.Student;
import com.ojt.studentcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Student student) {
        service.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/students")
    public String viewStudents(Model model) {

        model.addAttribute("students", service.getAllStudents());

        return "view";
    }

    @GetMapping("/welcome")
    public ModelAndView welcome() {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("welcome");

        mv.addObject("message", "Welcome to Spring Boot");

        return mv;
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable int id, Model model) {

        Student student = service.getStudentById(id);

        model.addAttribute("student", student);

        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {

        service.deleteStudent(id);

        return "redirect:/students";
    }
}
