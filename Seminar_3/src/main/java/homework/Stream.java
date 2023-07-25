package homework;

import java.util.*;

public class Stream {
    /**
     * @name Имя потока.
     */
    private String name;

    /**
     * @learnGroupList -  Список учебных групп в потоке.
     */
    protected ArrayList<LearnGroup> learnGroupList;

    /**
     * Конструктор класса
     */
    public Stream(String name) {
        this.name = name;
        learnGroupList = new ArrayList<LearnGroup>();
    }

    /**
     * Метод, возвращающий имя потока.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Метод, возвращающий список потока.
     */
    ArrayList<LearnGroup> getLearnGroupList() {
        return learnGroupList;
    }

    /**
     * Добавление группы в поток
     */
    public void add (LearnGroup learnGroup) {
        learnGroupList.add(learnGroup);
    }

    /**
     * Метод, удаляющий группу из потока.
     * @param learnGroup
     */
    public void remove (LearnGroup learnGroup) {
        learnGroupList.remove(learnGroup);
    }

    public void showGroup() {
        System.out.println("Stream " + name);
        System.out.println("Groups:");
        if (!learnGroupList.isEmpty()){


        } else System.out.printf("Поток %s пуст.\n", name);
    }
}
