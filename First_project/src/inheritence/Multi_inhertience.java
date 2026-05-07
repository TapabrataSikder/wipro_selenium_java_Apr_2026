package inheritence;
class GrandParent
{
	void openland()
	{
		System.out.println("OpenLand ");
	}
}
class Parent extends GrandParent
{
	void flat()
	{
		System.out.println("2BHK");
	}
	void car()
	{
		System.out.println("Petrol");
	}
}
class Child extends Parent  // Can access all the properties from grandparent + parents too
{
	void bike()
	{
		System.out.println("Pulsar");
	}
}

public class Multi_inhertience {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child mohan=new Child();
		mohan.flat();
		mohan.car();
		mohan.bike();
		mohan.openland(); 

		Parent sohan=new Parent();
		sohan.flat();
		sohan.car();
//		sohan.bike(); 
	}

}
