package inheritence;

class Hosp
{
	String name="Hospital Name";
	String loc = "Kolkata";
	
	void hospdetails()
	{
		System.out.println("From Hosputal---------");
		System.out.println("hospital mane: "+name);
		System.out.println("hospital location: "+loc);
	}
}

class Doctor extends Hosp
{
	String name="Doctor Name";
	String deg = "MBBS";
	
	void docdetails()
	{
		System.out.println("From Doctorr---------");
		System.out.println("Doctor mane: "+name);
		System.out.println("Doctor degree: "+deg);
	}
}

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d=new Doctor();
		d.hospdetails();
		d.docdetails();
	}

}
