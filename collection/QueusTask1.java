package collection;

import java.util.ArrayDeque;

public class QueusTask1 {

	public static void main(String[] args) {
		// Explore the methods in ArrayDeque
		ArrayDeque<String> set= new ArrayDeque<String>();
		 set.add("shweta");
		 set.add("komal");
		 set.add("yash");
		 set.add("ranjay");
		 set.addFirst("samarth");
		 set.addLast("chinmayee");

         System.out.println(set);
         System.out.println(set.size());
         System.out.println(set.getFirst());
         System.out.println(set.getLast());
         System.out.println(set.isEmpty());
         
         
	}

}
