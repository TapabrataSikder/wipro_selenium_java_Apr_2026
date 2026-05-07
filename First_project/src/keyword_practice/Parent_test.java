package keyword_practice;


class Parent
{
	int x=100;
	void culture() {
		System.out.println("Indian culture");
	}
}
class Child extends Parent
{
	int x=10;
	void show()
	{
		super.culture();
		System.out.println("Western cukture");
//		System.out.println("CHild value of x = "+x);
//		System.out.println("Parent value of x = "+super.x);
	}
}


public class Parent_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.show();
	}

}
