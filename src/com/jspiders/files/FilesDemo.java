package com.jspiders.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesDemo {

    public static void main(String[] args)
    {
        System.out.println("Program starts...");

        File f1 = new File("D://Demo2/Test1.txt");
        
        try {
            FileReader fw = new FileReader(f1);
            int len = (int)f1.length();//number of chars in given file
            char[] c1 = new char[len];
            fw.read(c1);
            String data = String.valueOf(c1);
            System.out.println(data);
            System.out.println("File writing completed successfully");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Program ends............");
    }
}
