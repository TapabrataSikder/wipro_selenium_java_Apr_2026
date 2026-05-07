package Control_Statements;

public class IF_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float per = 95f;
		
		if(per>0 && per<=100) {
		
			if(per>=75)
			{
				System.out.println("Distinction");
				if(per>=85) 
					System.out.println("Distinction and A+");
				if(per>=95) 
					System.out.print("Distinction and A++");				
			}
			else if(per >= 60 && per<75)
				System.out.print("First Class");
			else if(per >= 50 && per<60)
				System.out.print("Second Class");
			else if(per >= 40 && per<50)
				System.out.print("Pass Class");
			else
				System.out.print("Failed");
		}
		else
			System.out.print("Invalid Percentage");
	}

}
