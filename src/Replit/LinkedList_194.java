package Replit;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_194 {
    public static void main(String[] args) {
        /*Create a method that takes a list as a paramter removes an element if it starts with letter A from given List
        and return new List then in the main method print that list. **Expected Output:**[USA, Kazakhstan, Pakistan, Russia] */
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");
        countries.removeIf(x -> x.startsWith("A"));
        System.out.println(countries);
    }
}