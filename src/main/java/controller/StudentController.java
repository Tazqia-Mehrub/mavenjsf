package controller;

import data.model.Student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "studentController")
public class StudentController {
    Student  student = new Student();

    public StudentController() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public String isNextPage(){
        return "success";
    }

}
