package object_class_method;

public class Vehicle {
	
	void details(int roll, String name) {
		System.out.println("Roll no: "+roll);
		System.out.println("Name: "+name);
	}
	
	void details(String loc, String degree) {
		System.out.println("Location: "+loc);
		System.out.println("Degree: "+degree);
	}
	
	void details(String name, int roll, int age) {
		System.out.println("Roll no: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle ob=new Vehicle();
		ob.details(101, "Rahul");
		System.out.println("-----------------------");
		ob.details("Kolkata", "B.tech");
		System.out.println("-----------------------");
		ob.details("Rahul", 101, 23);

	}

}
