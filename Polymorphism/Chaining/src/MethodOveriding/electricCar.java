package MethodOveriding;

public class electricCar extends Car{
	public static void start()
	{
		System.out.println("Start Electric Car");
	}
	@Override
	public void drive()
	{
		System.out.println("Drive Electric Car");
	}
}
