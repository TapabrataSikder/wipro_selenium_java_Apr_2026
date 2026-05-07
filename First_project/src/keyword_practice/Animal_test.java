package keyword_practice;

class Animal
{
	int x=100;
	String name, type;
	
	void eat(int x, String name, String type)
	{
		System.out.println("\nFrom void eat ----------");
		System.out.println("X= "+this.x); // x = 100
		this.x=x;
		this.name=name;
		this.type=type;
		System.out.println("X= "+x);
		System.out.println("Name= "+name);
		System.out.println("type= "+type);
	}
	
	void details()
	{
		System.out.println("\nFrom void details ----------");
		this.eat(101, "Max", "Dog");
	}
	
	Animal()
	{
		System.out.println("Constructor Animal ----------");
		System.out.println("Default Constructro");
	}
}

public class Animal_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat(1, null, null);
		a.details();

	}

}
