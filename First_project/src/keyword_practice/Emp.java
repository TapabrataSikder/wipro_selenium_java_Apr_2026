package keyword_practice;

public class Emp {
	
	static class Innerclass
	{
		void testt()
		{
			System.out.println("testing");
		}
	}
	
	int empid;
	String name;
	static String compname="wipro";
	void show(int empid1, String name1) {
		empid=empid1;
		name=name1;
//		compname=compname1;
		System.out.println("empid: "+empid);
	}
	
	// static method
	static void details(int empid1, String name1)
	{
		String st;
		System.out.println("Company Name= "+compname);
	}
	
	// non-static block 
	{
		System.out.println("Non Static");
	}
	
	// static block without names will automatically
	//	called first in the main method
	static
	{
		System.out.println("Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp=new Emp();
		emp.show(101, "Rohit");
		details(102, "Rohit");
		
		Emp.Innerclass test=new Innerclass();
		test.testt();
	}

}
