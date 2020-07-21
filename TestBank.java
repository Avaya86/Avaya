package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSBCBank hs = new HSBCBank();
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.caLoan();
		
		//dynamic polymorphism - child class object can be refered by parent interface reference variable
	System.out.println("***dynamic polymorphis ***");
		USBank b = new HSBCBank ();
		b.credit();
		b.debit();
		b.transferMoney();
		
		System.out.println(hs.min_bal);

	}

}
