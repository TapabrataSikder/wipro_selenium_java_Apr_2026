package inheritence;

class Animal // Parent/Base/Super class
{
	void eat(String eat) 
	{
		System.out.println("Eat= "+eat);
	}
	
	void sound(String sd)
	{
		System.out.println("Sound= "+sd);
	}
}

class Dog extends Animal // Child/sub/extended Class
{
	void color()
	{
		System.out.println("Black");
	}
}

class Cat extends Animal
{
	void walk()
	{
		System.out.println("Cat walk");
	}
}

public class Single_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		d.color();
		d.eat("Pedigree");
		
		Cat c=new Cat();
		c.walk();
		c.eat("Milk");

	}

}
