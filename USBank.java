package OOPConceptsPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
	//only method declaration
	//no method body -- only method prototype
	//in interface we can declare the variables and variables are by default static
	//variable value will not be changed
	//no static method in interface
	//no main method in interface
	//interface are abstract in nature, we cannot create the object.
	
}