package AcessModifier;
/*
 * Encapsulation :- It is mechanism of binding code and data together in single unit. 
 */
public class ClassA {
	
	/*
	  Variable declared as private.
	  These private variable can only be accessed by public method
	 */
	private int age;
	private String name;
	
	// Getter and Setter method to access private variable
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
