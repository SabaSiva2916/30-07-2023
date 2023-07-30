package org.sample;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {

	System.out.println("Hello World");
	List<String> li = new ArrayList<String>();
	// Adding value into list
	li.add("A");
	li.add("B");
	li.add("C");
	li.add("D");
	li.add("E");

	// Printing the value of list
	System.out.println(li);

	// Iterating by using for loop
	for (int i = 0; i < li.size(); i++) {
	    String string = li.get(i);
	    System.out.println(string);
	}
    }
}
