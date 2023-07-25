package org.example;

public class Student {
    private String name;
    private String birthday;
    private Integer idGroup;

    public Student(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setIdGroup (Integer id) {
        idGroup = id;
    }

    public Integer getIdGroup () {
        return idGroup;
    }

    @Override
    public String toString() {
        return String.format("%s %s group %d", name, birthday, idGroup);
    }
}
