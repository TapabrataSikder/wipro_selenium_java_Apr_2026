package inheritence;

class Hosp
{
	String name="Hospital Name";
	String loc = "Kolkata";
	final int id = 101;
	
	void hospdetails()
	{
		System.out.println("From Hosputal---------");
		System.out.println("hospital mane: "+name);
		System.out.println("hospital location: "+loc);
		System.out.println("hospital ID: "+id);
	}
}

class Doctor extends Hosp
{
	String name="Doctor Name";
	String deg = "MBBS";
//	int id=102;
	
	void docdetails()
	{
		System.out.println("From Doctorr---------");
		System.out.println("Doctor mane: "+name);
		System.out.println("Doctor degree: "+deg);
		System.out.println("hospital ID: "+id);
	}
}

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d=new Doctor();
		d.hospdetails();
		d.docdetails();
//		d.id=102;
	}

}
