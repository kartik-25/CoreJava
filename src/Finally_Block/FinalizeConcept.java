package Finally_Block;
/*
 Garbage collector = Garbage collector will collect all object having no reference then 
 destroy them to free memory space.
 
 Rule = Finalize() method will be called before Garbage collector.
        This Finalize method will perform some clean up just before garbage collector.
 */

public class FinalizeConcept {
	
	public void finalize() {
		System.out.println("Finalize method must be called before garbage collector");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeConcept ob = new FinalizeConcept();
		FinalizeConcept ob1 = new FinalizeConcept();
		FinalizeConcept ob2 = new FinalizeConcept();
		FinalizeConcept ob3 = new FinalizeConcept();
		FinalizeConcept ob4 = new FinalizeConcept();
		FinalizeConcept ob5 = new FinalizeConcept();
		FinalizeConcept ob6 = new FinalizeConcept();
		
		ob =null;
		ob1 =null;
		ob2 =null;
		ob3 =null;
		ob4 =null;
		ob5 =null;
		ob6 =null;
		
		
		// calling garbage collector manually. Finalize method will be called before garbage collector.
		System.gc();
		
		
		
		

	}

}
