package com.jspiders.collections.impl;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo {

    private static Vector<Student> studentsList = new Vector();

    public static void addStudent()
    {
        System.out.println("Adding student...");
        Student s1 = new Student(1,"AAA",85.0);
        studentsList.add(s1);
        System.out.println("Adding student successful");
    }

    public static void getStudentByIndex(int index)
    {
        System.out.println(studentsList.get(index));
    }

    public static void getStudentById(int id)
    {
       //
    }

    public static void getAllStudents()
    {
        System.out.println("Getting all students...");
       for(Student s1 : studentsList){
           System.out.println(s1);
       }
    }

    public static void main(String[] args)
    {
        System.out.println("Program starts...");
        addStudent();
        getStudentByIndex(0);
        getAllStudents();
        System.out.println("Program ends...");
    }
}
