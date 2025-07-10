package org.example.model;

import org.example.enums.UserRole;

public class Student extends User {
    private int level;

    public Student(String name,  int level) {
        super(name, UserRole.STUDENT);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "level=" + level +
                '}';
    }
}

