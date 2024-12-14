package Polymorphism;

public class ShapeDriver {

	public static void main(String[] args) {
		System.out.println("This is main Method ");
		System.out.println();
		twoDshape td1 = new Circle();
		twoDshape td2 = new Rectangle();
		twoDshape td3 = new Square();
		td1.getArea();
		td2.getArea();
		td3.getArea();

	}

}
