package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* List Iterator
=>	List Iterator has additional method of hasPrevious () and previous().
=>	first always use hasnext () and next () method. After that use hasPrevious() and previous().

Rule=> Under ListIterator if we first use hasPrevious() and Previous() method then as result this code will not work. */
public class ListIteratorInJava_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List <Integer> A = new ArrayList<Integer>();
	A.add(2);
	A.add(4);
	A.add(6);
	A.add(8);
	A.add(10);
	System.out.println("Entire record of A arraylist"+A);
	System.out.println("Size of A arraylist"+A.size());
	
	System.out.println("*************Scenario of List Iterator **************");
	ListIterator<Integer> itr=A.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	  System.out.println("*************Backward direction using hasPrevious() and Previous() method***************");
	  while(itr.hasPrevious()) {
		  System.out.println(itr.previous());
	  }

	}

}
