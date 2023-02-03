package com.demo;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("D:\\testout.txt");
            fw.write("Welcome to javaTpoint.");
            fw.close();
        }catch(FileNotFoundException fe){
            System.out.println("FileNotFoundException"+fe.getMessage());
        }
        catch(IOException ie ){
            System.out.println("IOException"+ie.getMessage());
        }

    }
}
