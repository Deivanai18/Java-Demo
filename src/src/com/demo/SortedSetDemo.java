package com.demo;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();
        // Add the elements in the given set.
        set.add("Audi");
        set.add("BMW");
        set.add("Mercedes");
        set.add("Baleno");
        System.out.println("The list of elements is given as:");
        for (Object object : set) {
            System.out.println(object);
        }
        System.out.println("The first element is given as: " + set.first());
        System.out.println("The last element is given as: " + set.last());
        System.out.println("The respective element is given as: " + set.headSet("Baleno"));
        System.out.println("The respective element is given as: " + set.tailSet("Audi"));
    }
}
