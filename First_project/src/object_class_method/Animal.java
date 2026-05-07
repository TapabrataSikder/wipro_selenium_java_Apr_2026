package object_class_method;

public class Animal {

	void sound(String name, String sound) {
		System.out.println("Name is: "+name);
		System.out.println("Sound: "+sound);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog=new Animal();
		dog.sound("Max", "Bark");
		
		Animal cat=new Animal();
		cat.sound("Kitty", "Meow");

	}

}
