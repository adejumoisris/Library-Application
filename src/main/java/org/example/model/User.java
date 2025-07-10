package org.example.model;

import org.example.enums.UserRole;

public abstract class User {
  protected String name ;
   protected UserRole role;

    public User(String name, UserRole role) {
        this.name = name;
        this.role = role;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
