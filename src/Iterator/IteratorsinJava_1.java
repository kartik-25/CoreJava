package Iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*  Iterator = It is basically a interface that has three method .
=>	These method are ‘hasnext’ , ‘next’ and ‘remove’.
=>	Hasnext will check whether there is data or not in collection framework.
=>	Next will return the data and move the pointer to next element 
=>	Remove will remove data from collection framework. Or remove from collection of object
 */

public class IteratorsinJava_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List A = new ArrayList<>();
	A.add(2);
	A.add(4);
	A.add(2.5);
	A.add(2.5);
	A.add('k');
	A.add("test");

	System.out.println("Entire record of A arraylist"+A);
	
	Iterator itr =A.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
	}

}
