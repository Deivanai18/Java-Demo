package com.demo;

public class ExceptionDemo {
    public static void main(String[] args){
        int num[]={1,2,3,4,5};
       try {
           System.out.println("length of array:" + num.length);
           System.out.println("number at 3 index is " + num[3]);
           System.out.println(10/0);
           System.out.println("number at 6 index is " + num[6]);

       }
       catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
       }
       catch (ArithmeticException ae){
           System.out.println(ae.getMessage());
       }
        catch (Exception exe){
           System.out.println("Exception caught");

        }
      System.out.println("Program Executed completely");

    }
}
