package com.imane.student.Service;

import com.imane.student.model.Student;

import java.util.List;

public interface StudentService{
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
