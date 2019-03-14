package com.yourname.demo.service;

import com.yourname.demo.model.Student;
import com.yourname.demo.DAO.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    private final StudentDAO studentDAO;

    @Autowired
    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public int persistNewStudent(UUID studentId, Student student){
        UUID studentUid = studentId  == null ? UUID.randomUUID() : studentId;
        student.setId(studentId);
        return studentDAO. insertNewStudent(studentUid, student);
    }

    public Student getStudentByID(UUID studentId){
        return studentDAO.selectStudentByID(studentId);

    }

    public List<Student> getAllStudents(){
        return studentDAO.selectAllStudents();
    }

    public int updateStudentByID (UUID StudentId, Student studentUpdate){
        return studentDAO.updateStudentByID(StudentId, studentUpdate);
    }

    public int deleteStudentByID(UUID StudentId){
        return studentDAO.deleteStudentByID(StudentId);
    }


}
