package com.yourname.demo.DAO;

import com.yourname.demo.model.Student;
import java.util.*;
import java.util.UUID;

public interface StudentDAO {
    int insertNewStudent(UUID studentID, Student student);

    Student selectStudentByID(UUID studentID);

    List<Student> selectAllStudents();

    int updateStudentByID (UUID StudentID, Student studentUpdate);

    int deleteStudentByID(UUID StudentID);

}
