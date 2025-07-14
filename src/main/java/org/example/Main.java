package org.example;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;
import org.example.service.LibraryWithOutPriority;
import org.example.service.LibraryWithPriority;

public class Main {
    public static void main(String[] args) {
        LibraryWithOutPriority libraryWithOutPriority = new LibraryWithOutPriority();
        libraryWithOutPriority.addbook("Mahematice", 1);

        User student = new Student("Osinachukwu " , 100);
        User teacher = new Teacher("Mr Emmanual");

        libraryWithOutPriority.requestBook(teacher, "Mahematice" );
        libraryWithOutPriority.requestBook(student, "Mahematice" );

        System.out.println(libraryWithOutPriority.serveNextRequest());
        System.out.println(libraryWithOutPriority.serveNextRequest());
    }
}