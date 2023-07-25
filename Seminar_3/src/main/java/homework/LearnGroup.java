package homework;

import java.util.ArrayList;
import java.util.List;

public class LearnGroup {
    /**
     * id - Номер группы
     */
    protected Integer id;
    /**
     * studentList - Список студентов группы.
     */
    protected List<Student> studentList;

    /**
     * Конструктор класса
     * @param id - номер группы
     */
    public LearnGroup(Integer id) {
        this.id = id;
        studentList = new ArrayList<Student>();
    }

    /**
     * Метод, возвращающий номер группы.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Метод, добавляющий студента в список студентов. Если у студента не указан номер группы - устанавливается номер текущей группы.
     */
    public void addStudentList (Student student) {
        studentList.add(student);
        if (student.getIdGroup() != id) {
            student.setIdGroup(id);
        }
    }

    /**
     * Метод, возвращающий список студентов.
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * Просмотр состава группы.
     */
    public void showGroup() {
        System.out.println("Group" + id);
        System.out.println("Students:");
        for (Student student: studentList) {
            System.out.printf("%s %s\n", student.getName(), student.getBirthday());
        }
    }
}


