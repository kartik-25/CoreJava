package Abstraction;

public abstract class AbstractBankClass {
	
void test() {
System.out.println("I belong to bank abstract class");
}

// Rule => We can create default constructor of Abstract class.
public  AbstractBankClass() {
	System.out.println("Constructor of AbstractBankClass()");
}

public void OpenBankAccount() {
System.out.println("Please collect form for opening bank account");
}

// Rule => We can not create implementation(write method body) of abstract class as compile time error is displayed.
// Rule => If a class is declared as abstract than at-least one method must be abstract.
// Rule => We must declared abstract method with abstract keyword.
abstract void RateOfInterest();

}
