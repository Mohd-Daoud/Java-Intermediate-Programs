package MethodOveriding;

class Drive extends electricCar{
	public static void main(String[] args) {
		System.out.println("=====Before Object=====");
		Vehicle.start();
		Car.start();
//		electricCar();
		System.out.println("=====After Object=====");
		Vehicle v1 = new Car();
		v1.start();
//		Vehicle v2 = new electricCar();
		
		
	}
}
