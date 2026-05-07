package INterface_practice;

interface Polygon
{
	double getArea();
	
	default double getPerimeter(int... sides)
	{
		double sum=0;
		for (int side : sides) {
            sum = sum + side;
        }
        return sum;
	}
	static String shapeInfo() {
		return "Polygons";
	}
}

class Rectangle implements Polygon {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double getArea() {
        return length * width;
    }
}

class Triangle implements Polygon {
    double base, height;

    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Default_static_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Polygon.shapeInfo());

        Rectangle rect = new Rectangle(10, 5);
   
        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter(10, 5, 10, 5));

        Triangle tri = new Triangle(4, 3);
        System.out.println("\nTriangle Area: " + tri.getArea());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter(10, 12, 15));

	}

}
