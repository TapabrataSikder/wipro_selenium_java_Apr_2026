package inheritence;

class Grandparent
{
	void openland()
	{
		System.out.println("Openland for commercial use");
	}
}
class Parent1 extends Grandparent
{
	void flat()
	{
		System.out.println("2BHK");
	}
	void car()
	{
		System.out.println("BAleno Petrol car");
	}
}
class Parent2 extends Grandparent
{
	void flat()
	{
		System.out.println("2BHK");
	}
	void car()
	{
		System.out.println("BAleno Petrol car");
	}
}
class Childp1 extends Parent1
{
	void bike()
	{
		System.out.println("Pulsar");
	}
}
class Child1p2 extends Parent2
{
	void bike()
	{
		System.out.println("Pulsar");
	}
}

public class Multi_inherit_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childp1 mohan=new Childp1();
		mohan.flat();// self
		mohan.car();// parent
		mohan.openland();// grandparent
		
		Child1p2 sohan=new Child1p2();
		sohan.flat();
		sohan.bike();// parent
		
	}
 
}