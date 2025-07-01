package ArrayProgram;

import java.util.Scanner;

public class Task1A {
	// 1. WAP to print unique elements of the array.
	public static void main(String[] args) {
	    int a[] = {3, 7, 8, 3, 4, 4};

	    for (int i = 0; i < a.length; i++) {
	        int count = 0;

	        for (int j = 0; j < a.length; j++) {
	            if (a[i] == a[j]) {
	                count++;
	            }
	        }

	        if (count == 1) {
	            System.out.println(a[i]);
	        }
	    }
	}

}
