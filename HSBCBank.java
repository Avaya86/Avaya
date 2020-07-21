package OOPConceptsPart2;

public class HSBCBank implements USBank,BrazilBank{// we are acheiving multiple inheritance
	// this reln IS-A relation-  interface to class relationship
	//HAS-A is class to class relaionship

	
	//if a class is implementing any interface , then it is mandatory to override all the methods of interface
	//override class methods
	public void credit() {
		System.out.println("credit");
		
	}
	
	public void debit() {
		System.out.println("debit");
		
	}
	
	public void transferMoney() {
		System.out.println("transfer money");
		
	}
	//separate methods of hsbc bank
	public void educationLoan() {
		System.out.println("education loan");
		
	}
	
	public void caLoan() {
		System.out.println("car loan");
		
	}
	
	//brazil bank method,overridding from brazil bank
	
	public void mutualFund() {
		System.out.println("mutual fund");
	}
}
