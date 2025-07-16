package org.example;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;
import org.example.service.LibraryWithOutPriority;
import org.example.service.LibraryWithPriority;

public class Main {
    public static void main(String[] args) {

        // with out priority
        LibraryWithOutPriority libraryWithOutPriority = new LibraryWithOutPriority();
        libraryWithOutPriority.addbook("Mahematice", 1);

        User student = new Student("Osinachukwu " , 100);
        User teacher = new Teacher("Mr Emmanual");

        libraryWithOutPriority.requestBook(teacher, "Mahematice" );
        libraryWithOutPriority.requestBook(student, "Mahematice" );

//        System.out.println(libraryWithOutPriority.serveNextRequest());
//        System.out.println(libraryWithOutPriority.serveNextRequest());

        // with priority

        LibraryWithPriority libraryWithPriority = new LibraryWithPriority();
        libraryWithPriority.addbook("java", 4);

        User student1 = new Student(" Eniola" , 100);
        User teacher1 = new Teacher("Mr Matin");
        User seniorStudent = new Student("Joshua" , 400);

        libraryWithPriority.requestBook(student1, "java");
        libraryWithPriority.requestBook(teacher1, "java");
        libraryWithPriority.requestBook(seniorStudent,"java");

        System.out.println(libraryWithPriority.serveNextRequest());
        System.out.println(libraryWithPriority.serveNextRequest());
        System.out.println(libraryWithPriority.serveNextRequest());

    }
}