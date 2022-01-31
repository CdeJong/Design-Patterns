package com.cdejong.patterns.iterator;

import java.util.Iterator;

public class IteratorPattern {

    public static void main(String[] args) {

        // Iterable StudentManager
        StudentManager studentManager = new StudentManager();

        // print all students with studentManager foreach, for( : )
        for (Student student : studentManager) {
            System.out.println(student);
        }

        System.out.println(); // separator

        // print all students with studentManager foreach, for( : )
        for (Student student : studentManager.getStudents()) { // getStudents in redundant in this example, but this works too.
            System.out.println(student);
        }

        System.out.println(); // separator

        // print all students with studentManager for loop, for(int i; condition; i++), this is an example what foreach does.
        for (Iterator<Student> i = studentManager.iterator(); i.hasNext(); /* not used */) { // the i.next already adds 1 to the index
            Student student = i.next();
            System.out.println(student);
        }

        System.out.println(); // separator

        // the Iterable also adds a (default if not overridden) .forEach() method with a consumer (Strategy pattern)
        studentManager.forEach(System.out::println);
        // studentManager.forEach(student -> System.out.println(student));










    }

}
