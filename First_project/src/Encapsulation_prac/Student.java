package Encapsulation_prac;

public class Student {
	
	protected String name;
	public int roll=202;
	private int amount=1000;
	
	public void getname(String name){
		this.name=name;
	}
	
	public void fees(int amount) {
		this.amount=amount;
	}
	
	public int getamount() {
		return this.amount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		BankAccount ba=new BankAccount();
		st.getname("Tapa");
//		st.fees();
		
		
	}

}
