package practical;
import java.util.Scanner;

public class abstractclasses{
	
	
	    abstract static class Shape {
	        abstract void draw(); // abstract method

	        void info() { // normal method
	            System.out.println("This is a shape.");
	        }
	    }

	    // Concrete subclasses
	    static class Circle extends Shape {
	        void draw() {
	            System.out.println("Drawing a Circle");
	        }
	    }

	    static class Square extends Shape {
	        void draw() {
	            System.out.println("Drawing a Square");
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter shape name (circle/square): ");
	        String shapeName = sc.next().toLowerCase();

	        Shape shape; // reference of abstract class

	        if (shapeName.equals("circle")) {
	            shape = new Circle();
	        } else if (shapeName.equals("square")) {
	            shape = new Square();
	        } else {
	            System.out.println("Invalid shape.");
	            sc.close();
	            return;
	        }

	        shape.info(); // normal method
	        shape.draw(); // overridden method

	        sc.close();
	    }
	}


