package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorinJava_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List A = new ArrayList<>();
	A.add('a');
	A.add("abcd");
	A.add(true);
	A.add(9);
	A.add(9.9);
	
	System.out.println("Entire record of Array list A ==>"+A);
	
	Iterator itr =A.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		// required records will be removed from arraylist
		itr.remove();
	}
	System.out.println("After Remove() method in array list"+A);
	}}
