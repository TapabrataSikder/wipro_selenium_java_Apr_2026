package My_details;

public class Student_info {
	void Education(){
		String college = "UEM";
		int pass_out = 2025;
		String degree = "Btech";
		double cgpa = 8.53;
		System.out.println("College: " + college);
        System.out.println("Degree: " + degree);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Passout: " + pass_out);
	}
	void My_info() {
		String name = "Tapabrata Sikder";
		int age = 23;
		String loc = "Kolkata";
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Location: " + loc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_info obj = new Student_info();
		System.out.println("From My_info:");
		obj.My_info();
		System.out.println(" \nFrom Education:");
		obj.Education();
		
		}

}
