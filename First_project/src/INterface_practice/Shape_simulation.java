//• Define an interface Movable with methods: 
//moveUp(), moveDown(), moveLeft(), moveRight(). 
//• Implement classes: 
//o MovablePoint(x, y, xSpeed, ySpeed) implements Movable 
//o MovableCircle(radius, center: MovablePoint) 
//o MovableRectangle(topLeft: MovablePoint, bottomRight: 
//MovablePoint) (ensuring both points have same speed) 
//• Provide toString() to display positions. 
//• In main(), create a few objects and call move 
//methods to simulate motion.


package INterface_practice;

interface Movable{
	void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable{
	int x, y, xSpeed, ySpeed;
	MovablePoint(int x, int y, int xSpeed, int ySpeed){
		this.x=x;
		this.y=y;
		this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
	}
	
	public void moveUp()
	{
		y = y-ySpeed;
	}
	
	public void moveDown() 
	{ 
		y =y+ ySpeed; 
	}
	
	public void moveLeft() 
	{ 
		x =x-xSpeed; 
	}
	
	public void moveRight() 
	{ 
		x =x+xSpeed; 
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ") speed=" + xSpeed + "," + ySpeed;
	}
	
}

class MovableCircle implements Movable {
	private int radius;
    private MovablePoint center;
    
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    
    public void moveUp() 
    { 
    	center.moveUp(); 
    }
    public void moveDown() 
    { 
    	center.moveDown(); 
    }
    public void moveLeft() 
    { 
    	center.moveLeft(); 
    }
    public void moveRight() 
    { 
    	center.moveRight(); 
    }
    public String toString() {
        return "Circle at " + center.toString() + " radius=" + radius;
    }
}

class MovableRectangle implements Movable {
	private MovablePoint topLeft;
    private MovablePoint bottomRight;
    
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    public String toString() {
        return "Rectangle [TopLeft: " + topLeft + ", BottomRight: " + bottomRight + "]";
    }
}

public class Shape_simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movable m1 = new MovablePoint(5, 5, 2, 2);
        System.out.println("Initial Point: " + m1);
        m1.moveRight();
        System.out.println("After moving right: " + m1);

        Movable m2 = new MovableCircle(10, 10, 1, 1, 20);
        System.out.println("\nInitial Circle: " + m2);
        m2.moveDown();
        System.out.println("After moving down: " + m2);

        Movable m3 = new MovableRectangle(0, 0, 10, 10, 5, 5);
        System.out.println("\nInitial Rect: " + m3);
        m3.moveUp();
        System.out.println("After moving up: " + m3);

	}

}
