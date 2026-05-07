package Exception_handling;

interface Payment{
	void transaction(double amt, int member); 
}

class Bill implements Payment{
	public void transaction(double amt, int member) {
		try {
			double amount = amt/member;
			if (member == 0) {
				throw new ArithmeticException("Division by zero");
			}
			System.out.println("Each member pay: " + amount);
		}
		catch (ArithmeticException e){
			System.out.println("Catch block");
            System.out.println("Check code: " + e.getMessage());
		}
		catch (Exception e) {
            System.out.println("Exception" + e);
        }
	}
}

public class ExceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment myProcessor = new Bill();

        System.out.println("No exception---");
        myProcessor.transaction(1000.0, 5);

        System.out.println("Exception----");
        myProcessor.transaction(500.0, 0);

	}

}
