package com.imane.student.controller;

import com.imane.student.Service.StudentService;
import com.imane.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControler {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student is added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

}
