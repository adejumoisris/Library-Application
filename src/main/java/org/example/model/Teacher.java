package org.example.model;

import org.example.enums.UserRole;

public class Teacher extends User{
    public Teacher(String name) {
        super(name, UserRole.TEACHER);
    }
}
