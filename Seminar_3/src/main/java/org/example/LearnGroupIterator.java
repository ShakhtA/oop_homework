package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class LearnGroupIterator extends LearnGroup implements Iterator<Student>, Iterable<Student> {
    public LearnGroupIterator(Integer id) {
        super(id);
    }

    private int index;

    @Override
    public boolean hasNext() {
        if (index++ < studentList.size()) {
            return true;
        } else {
            index = 0;
        }
        return false;
    }

    @Override
    public Student next() {
        return studentList.get(index - 1);
    }

    @Override
    public void remove() {
        studentList.remove(--index);
    }

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
