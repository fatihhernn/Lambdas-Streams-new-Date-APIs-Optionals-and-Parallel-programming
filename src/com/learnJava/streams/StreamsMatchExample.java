package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Predicate;

public class StreamsMatchExample {

    static Predicate<Student> studentPredicate = student -> student.getGpa() >= 3.9;

    public static boolean allMatch() {

        return StudentDataBase.getAllStudents().stream()
                .allMatch(studentPredicate);
    }

    public static boolean anyMatch() {

        return StudentDataBase.getAllStudents().stream()
                .anyMatch(studentPredicate);
    }

    public static boolean noneMatch() {

        return StudentDataBase.getAllStudents().stream()
                .noneMatch(studentPredicate);
    }

    public static void main(String[] args) {

        System.out.println("Result of allMatch : " + allMatch());
        System.out.println("Result of anyMatch : " + anyMatch());
        System.out.println("Result of noneMatch : " + noneMatch());
    }
}
