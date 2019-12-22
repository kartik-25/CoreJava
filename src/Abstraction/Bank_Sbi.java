package Abstraction;

public class Bank_Sbi extends AbstractBankClass {

	public static void main(String[] args) {
	
		AbstractBankClass ob = new Bank_Sbi();
		ob.test();
		ob.OpenBankAccount();
		ob.RateOfInterest();

	}

	@Override
	void RateOfInterest() {
    System.out.println("Rate of interest of SBI bank is 4%");		
	}

}
