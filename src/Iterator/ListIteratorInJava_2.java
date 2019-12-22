package Iterator;
/*
Rule => Under ListIterator if we first use hasPrevious() and Previous() method then as result this code will not work
*/
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInJava_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List A = new ArrayList<>();
    A.add('a');
    A.add("abcd");
    A.add(2);
    A.add(4.4);
    System.out.println("Entire record of A arraylist"+A);
    System.out.println("Size of A arraylist"+A.size());
    
    ListIterator itr =A.listIterator();
    /*
	 Rule => Under ListIterator if we first use hasPrevious() and Previous() method then as result this code will not work.
	 */
    System.out.println("****** first use hasPrevious() and previous() method****************");
    while(itr.hasPrevious()) {
    	System.out.println(itr.previous());
    }
	System.out.println("Rule => Under ListIterator if we first use hasPrevious() and Previous() method then as result this code will not work.");
	System.out.println("******later use hasnext() and next() method***************");
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
    
    
	}

}
