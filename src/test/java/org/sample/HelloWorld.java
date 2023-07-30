package org.sample;

public class HelloWorld {
    public static void main(String[] args) {

	System.out.println("Hello World");
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

    }
}
