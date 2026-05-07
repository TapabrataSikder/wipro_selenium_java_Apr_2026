package Wrapper_Class;

class Box {
    int length;

    Box(int l) {
        this.length = l;
    }
}

public class Object_class {
	
	public static void modifyBox(Box b) {
        System.out.println("Before: " + b.length);
        b.length = 500; 
        System.out.println("After: " + b.length);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10);
		System.out.println("Before call: "+b.length);
		modifyBox(b);
        
        System.out.println("After call: " + b.length);
	}

}
