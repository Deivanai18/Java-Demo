package com.demo;
import java.util.*;
import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {
    public static void main(String[] args) {
        try {
            List linkedList = new LinkedList<String>();
            linkedList.add("deiva");
            linkedList.add("sushu");
            linkedList.add("kaviye");
            linkedList.add("achu");
            linkedList.add("kavin");
            linkedList.add("raj");
            linkedList.add("xyz");
            List seclinkList=new LinkedList();
            seclinkList.addAll(linkedList);
            System.out.println(linkedList);
            System.out.println(linkedList.size());
            System.out.println((linkedList.contains("raj")) ? "true" : "false");
            linkedList.remove("xyz");
            System.out.println((linkedList.contains("xyz")) ? "true" : "false");
            System.out.println(linkedList.size());
            Iterator<String> itr= linkedList.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            System.out.println(linkedList.size());
            System.out.println("Reverse of LinkedList: ");
            Iterator<String> i= ((LinkedList) linkedList).descendingIterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
            System.out.println("Demonstrating:"+linkedList.isEmpty());
            linkedList.clear();
            System.out.println("post clearing the array list:"+linkedList.size());
            System.out.println(seclinkList);
            System.out.println(linkedList.get(8));

        }
        catch(Exception e){
            System.out.println("Exception :"+e.getMessage());
        }
    }

}
