package com.cdejong.patterns.iterator;

import java.util.Iterator;

// this object is Iterable, in this example I use the interfaces from java themselves, you could also make your own custom classes.
public class StudentManager implements Iterable<Student> {

    // Used a normal array in this example because ArrayList already has these interfaces implemented.
    private final Student[] students = new Student[6];

    public StudentManager() {
        // adding some students
        students[0] = new Student(10000, "Jaap");
        students[1] = new Student(10001, "Aiden");
        students[2] = new Student(10002, "Henk");
        students[3] = new Student(10003, "Rose");
        students[4] = new Student(10004, "Chris");
        students[5] = new Student(10005, "Rachel");
    }

    // you can also make a getter for the array, but this class is a collection class, so it's more efficient to use the Iterable.
    public Student[] getStudents() {
        return students;
    }

    // returns the iterator for this class
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(); // returns our custom iterator
    }

    // another method in the Iterable<T> interface is forEach()

    private class StudentIterator implements Iterator<Student> {

        int index; // = 0 (default)

        @Override
        public boolean hasNext() { // is there a next student
            if (index < students.length) {
                return true;
            }
            return false;
        }

        @Override
        public Student next() { // get the next student and add 1 to index
            if (this.hasNext()) {
                return students[index++];
            }
            return null;
        }
    }
}
