package com.yourname.demo.DAO;

import com.yourname.demo.model.Student;
import java.util.List;
import java.util.UUID;
import java.util.*;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository("fakeDaO")
public class FakeStudentDaoImpl implements StudentDAO {

    private final Map<UUID, Student> database;

    public FakeStudentDaoImpl() {
        database = new HashMap<>();
        UUID studentId = UUID.randomUUID();
        database.put(studentId,
                new Student(studentId, 14, "Manasa", "Pola", "SpringBoot"));
    }

    @Override
    public int insertNewStudent(UUID studentID, Student student) {
        database.put(studentID, student);
        return 1;
    }

    @Override
    public Student selectStudentByID(UUID studentID) {
        return database.get(studentID);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateStudentByID(UUID StudentID, Student studentUpdate) {
        database.put(StudentID, studentUpdate);
        return 1;
    }

    @Override
    public int deleteStudentByID(UUID StudentID) {
        database.remove(StudentID);
        return 1;
    }
}
