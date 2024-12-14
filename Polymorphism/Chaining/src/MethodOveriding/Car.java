package MethodOveriding;

class Car extends Vehicle{

	public static void start(){
		System.out.println("Start Car");
	}
	@Override
	public void drive()
	{
		System.out.println("Drive Car");
	}
}
