package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnGroup implements Iterable <Student> {
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
    public void add (Student student) {
        studentList.add(student);
        if (student.getIdGroup() != id) {
            student.setIdGroup(id);
        }
    }

    /**
     * Метод, удаляющий студента из группы.
     */
    public void remove(Student student) {
        studentList.remove(student);
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
        System.out.println("Group " + id);
        System.out.println("Students:");
        if (!studentList.isEmpty()){
            for (Student student: studentList) {
                System.out.printf("%s %s\n", student.getName(), student.getBirthday());
             }
        } else System.out.printf("Группа %d пуста.\n", id);
    }

    private int index;
    @Override
    public Iterator<Student> iterator() {
        Iterator<Student> it = new Iterator<Student>() {
            @Override
            public boolean hasNext() {
                return index < studentList.size();
            }

            @Override
            public Student next() {
                return studentList.get(index++);
            }
        };
        return it;
    }

}


