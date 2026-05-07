package Polymorphism_prac;


abstract class Hospital
{
	void patients() // non-abstract
	{
		System.out.println("From patients");
	}
	
	abstract void documents();
    abstract void ot();
    abstract void operation();
}

class Doctor extends Hospital
{
	void documents()
	{
		System.out.println("Doctor use documents");
	}
	void ot()
	{
		System.out.println("Doctor use documents");
	}
	void operation()
	{
		System.out.println("Doctor use operation");
	}
}

class Nurse extends Hospital
{
	void documents()
	{
		System.out.println("Nurse use documents");
	}
	void ot()
	{
		System.out.println("Nurse not use ot");
	}
	void operation()
	{
		System.out.println("Nurse not use operation");
	}
}

public class Hospital_management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hospital d = new Doctor();
	     d.patients();
	     d.documents();
	     d.ot();
	     d.operation();
	     
	     System.out.println();

	     Hospital n = new Nurse();
	     n.patients();
	     n.documents();
	     n.ot();
	     n.operation();

	}

}
