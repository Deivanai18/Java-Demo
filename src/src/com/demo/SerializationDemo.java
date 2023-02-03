package com.demo;

import java.io.*;


public class SerializationDemo {
    public static void main(String args[]){
        try{
            //Creating the object
            Student s1 =new Student(211,"deiva");
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("testout.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
    }
}
