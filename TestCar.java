package OOPConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static polymorphism or compile time polymorphism
		BMW b = new BMW();
		// when method name is the same child class has preference.
		
		b.start();
		
		b.stop();
		
		b.theftsafety();
		
		b.refuel();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		//child class object can be referenced by parent class reference variable 
		//is called dynamic polymorphism or run time polymorphism
		// top casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//down casting
		//BMW b1 = (BMW)new Car();//classcastexception -- no use
		
		
		

	}

}
