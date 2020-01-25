package com.springboot.controllers;

import com.springboot.forms.StudentFromHtml;
import com.springboot.models.Student;
import com.springboot.repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentsController {

    @Autowired
    private StudentRepositories studentRepositories;

    @GetMapping("/students")
    public String getStudents(ModelMap model){
        model.addAttribute("studentsFromServer", studentRepositories.findAll());
        return "students";
    }

    @PostMapping("/students")
    public String setStudents(StudentFromHtml studentFromHtml){
        Student newStudent = Student.from(studentFromHtml);
        studentRepositories.save(newStudent);
        return "redirect:students";
    }
}
