package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentCourseRepository studentCourseRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, StudentCourseRepository studentCourseRepository) {
        this.studentRepository = studentRepository;
        this.studentCourseRepository = studentCourseRepository;
    }

    public List<StudentCourse> getAllStudentsWithCourses() {
        List<StudentCourse> studentCourses = studentCourseRepository.findAll();
        Map<Long, List<StudentCourse>> studentCoursesByStudentId = studentCourses.stream()
                .collect(Collectors.groupingBy(sc -> sc.getStudent().getId()));
        List<StudentCourse> result = new ArrayList<>();
        for (Map.Entry<Long, List<StudentCourse>> entry : studentCoursesByStudentId.entrySet()) {
            for (StudentCourse studentCourse : entry.getValue()) {
                StudentCourse newStudentCourse = new StudentCourse();
                newStudentCourse.setStudent(studentCourse.getStudent());
                newStudentCourse.setCourse(studentCourse.getCourse());
                result.add(newStudentCourse);
            }
        }
        return result;
    }

    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findStudentWithHighestGpa();
    }

    public String joinStudentNames() {
        return studentRepository.findAll().stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }
}
