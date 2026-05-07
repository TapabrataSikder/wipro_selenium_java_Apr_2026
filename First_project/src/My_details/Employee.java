package My_details;

public class Employee {
	static String company = "Wipro"; // Static
	
	// GLobal variable
	String name;
	int ad, age;
	double sal;
	
	void dept(int dptid, String dptname) 
	{
		System.out.println("Department---");
		System.out.println("Company: " + company);
		System.out.println("Department ID: " + dptid);
		System.out.println("Department Name: " + dptname);
		
	}
	
	void empdetails(String name1, int age1, double sal1) {
        name = name1; // Global variable
        age = age1;
        sal = sal1;
    }
	
	void dispemp() {
        System.out.println("\nEmployee ---");
        System.out.println("Company: " + company);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + sal);
    }
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.dept(101, "Developer");
		obj.empdetails("Tapabrata", 23, 35000.00);
		obj.dispemp();
		
		
	}

}
