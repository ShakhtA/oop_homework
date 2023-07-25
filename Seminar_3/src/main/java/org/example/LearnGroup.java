package org.example;

import java.util.*;

public class LearnGroup {
    protected Integer id;
    protected List <Student> studentList;

    public LearnGroup(Integer id) {
        this.id = id;
        studentList = new ArrayList<Student>();
    }

    public Integer getId() {
        return id;
    }

    public void SetStudentList (Student student) {
        studentList.add(student);
        if (student.getIdGroup() != id) {
            student.setIdGroup(id);
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void showGroup() {
        System.out.println("Group" + id);
        System.out.println("Students:");
        for (Student student: studentList) {
            System.out.printf("%s %s\n", student.getName(), student.getBirthday());
        }
    }
}
