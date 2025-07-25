package collection;


import java.util.LinkedList;

public class QueueTask2 {

	public static void main(String[] args) {
		//  Create LinkedList of Integers and perform CRUD operations
      
		 LinkedList<Integer> set= new  LinkedList<Integer>();
		 set.add(2);
		 set.add(4);
		 set.add(6);
		 set.add(8);
		 System.out.println(set);
		 //System.out.println(set.add(10));
		 System.out.println(set.peekFirst());
		 System.out.println(set.poll());
		 System.out.println(set.contains(12));
		 System.out.println(set.lastIndexOf(set));
		 System.out.println(set.hashCode());
		 System.out.println(set.isEmpty());
		 System.out.println(set.offerFirst(10));
		 System.out.println(set.size());
	//	 System.out.println(set.remove(10));
		 
		 
	}

}
