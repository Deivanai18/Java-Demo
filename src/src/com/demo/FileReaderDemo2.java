package com.demo;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class FileReaderDemo2 {
    public static void main(String[] args){
        try{
            FileReader fr=new FileReader("testout.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
            System.out.println("Success");
        }  catch(FileNotFoundException fe){
            System.out.println("FileNotFoundException"+fe.getMessage());
        }
        catch(IOException ie ){
            System.out.println("IOException"+ie.getMessage());
        }

    }
}






