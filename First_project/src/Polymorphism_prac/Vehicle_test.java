package Polymorphism_prac;

//Polymorphism - 1. compile time -> Method overloading-
//					1. Same method name but different arguments
//					2. method overloading done in same class
//				2. Runtime -> Method overriding
//					1. same method name and same arguments
//					2. method overriding done on different class (Is-a-relationship(inheritance))


class Vehicle
{
	void nooftyre()
	{
		System.out.println("any");
	}
	void type()
	{
		System.out.println("Any");
	}
}

class Scooter extends Vehicle
{
	void nooftyre()
	{
		System.out.println("2");
	}
	void type()
	{
		System.out.println("Petrol");
	}
}

public class Vehicle_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scooter sc=new Scooter();
		sc.nooftyre();
		sc.type();
	}

}
