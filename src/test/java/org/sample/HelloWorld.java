package org.sample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	// Declare of array with String type
	String[] arr = new String[5];
	arr[0] = "Java";
	arr[1] = "Selenium";
	arr[2] = "Python";
	arr[3] = "API Testing";
	arr[4] = "Appium";

	// Iterating by using for each loop
	for (String ss : arr) {
	    System.out.println(ss);
	}

	// Declare of 2D array with int type
	int[][] ar = new int[2][2];
	ar[0][0] = 10;
	ar[0][1] = 20;
	ar[1][0] = 30;
	ar[1][1] = 40;

	// Iterate 2d array bt for loop
	for (int i = 0; i < ar.length; i++) {
	    for (int j = 0; j < ar[i].length; j++) {
		System.out.print(ar[i][j] + " ");
	    }
	    System.out.println();
	}

        //Declare of Map
	Map<String, String> map = new LinkedHashMap<String, String>();
	map.put("J", "Java");
	map.put("S", "Selenium");
	map.put("P", "Python");
	map.put("A", "ApiTesting");
	
	//Iteration  of map
	Set<Entry<String, String>> entrySet = map.entrySet();
	for (Entry<String, String> entry : entrySet) {
	    System.out.println(entry.getKey()+"  "+entry.getValue());
	}
	
    }
}
