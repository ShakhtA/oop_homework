package org.example;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student("Ivanov Ivan", "01.05.2005");
        Student petrova = new Student("Petrova Anna", "23.08.2005");
        Student smirnov = new Student("Smirnov Alexey", "27.03.2007");
        LearnGroupIterator group1 = new LearnGroupIterator(4631);
        group1.SetStudentList(ivanov);
        group1.SetStudentList(petrova);
        group1.SetStudentList(smirnov);

        System.out.println("Печать с итератором: ");
        /*
        while (group1.hasNext()) {
            System.out.println(group1.next());
        }
        System.out.println("=============");
        int count = 0;
        while (group1.hasNext()) {
            if (count == 1) {
                System.out.println(group1.next());
                group1.remove();
            }
            count++;
        }
        System.out.println("=============");
        while (group1.hasNext()) {
            System.out.println(group1.next());
        }
         */
        for (Student student : group1) {
            System.out.println(student);
        }

    }
}