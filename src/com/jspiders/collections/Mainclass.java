package com.jspiders.collections;

import java.util.ArrayList;

public class Mainclass {

    public static void main(String[] args) {

        System.out.println("Program starts...");

        ArrayList a1 = new ArrayList();
        a1.add(10);//insert
        a1.add(null);
        a1.add(20);
        a1.add(10);
        a1.add(null);
        a1.add(30);

        //read one element
        System.out.println("element at index 5 : "+a1.get(5));

        //read all elements
        for(int index=0;index<=a1.size()-1;index++){
            System.out.println(a1.get(index));
        }

        System.out.println("before update : " +a1.get(1));
        a1.add(1,5000);//update
        System.out.println("after update: " +a1.get(1));

        System.out.println();

        System.out.println("before delete: " +a1.get(1));
        a1.remove(1);//delete
        System.out.println("after delete: " +a1.get(1));

        //search
        boolean res  = a1.contains(20);
        System.out.println("res : "+res);

        System.out.println("Program ends...");
    }
}
