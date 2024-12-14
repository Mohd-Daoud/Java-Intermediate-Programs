package FirstProgram;

public class Car {
	private String Manufacturer;
	private String Model;
	private String Color;
	private String Fuel_Type;
	
	//Set method used
		public void SetManufacturer(String Manufacturer)
		{
			this.Manufacturer = Manufacturer;
		}
		public void SetModel(String Model)
		{
			this.Model = Model;
		}
		public void SetColor(String Color)
		{
			this.Color = Color;
		}
		public void SetFuel_Type(String Fuel_Type)
		{
			this.Fuel_Type = Fuel_Type;
		}
	//Get method used
		public String GetManufacturer()
		{
			return Manufacturer;
		}
		public String GetModel()
		{
			return Model;
		}
		public String GetColor()
		{
			return Color;
		}
		public String GetFuel_Type()
		{
			return Fuel_Type;
		}
		
}
