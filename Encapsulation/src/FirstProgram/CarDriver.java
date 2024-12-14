package FirstProgram;

public class CarDriver {
	public static void main(String[] args) {
		System.out.println("All Values Are Set");
		Car c = new Car();
		c.SetManufacturer("Toyota");	 c.SetModel("Camry XLE");
		c.SetColor("Blue");		c.SetFuel_Type("Petrol");
		System.out.println("Get All Data");
		c.GetManufacturer();	 c.GetModel();
		c.GetColor();			 c.GetFuel_Type();
	}
}
