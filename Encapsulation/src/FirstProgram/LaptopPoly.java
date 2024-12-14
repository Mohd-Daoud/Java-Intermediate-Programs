package FirstProgram;

public class LaptopPoly {
	private String Company_Name;
	private String Processor;
	private String Generation;
	private int RAM;
	private int Storage;
	private String Price_Range;
	//Set Method is used
	public void SetCName(String Company_Name) 
	{
		this.Company_Name = Company_Name;
	}
	public void SetProcessor(String Processor)
	{
		this.Processor = Processor;
	}
	public void SetGeneration(String Generation)
	{
		this.Generation = Generation;
	}
	public void SetRam(int RAM)
	{
		this.RAM = RAM;
	}
	public void SetStorage(int Storage)
	{
		this.Storage = Storage;
	}
	public void SetPrice_Range(String Price_Range)
	{
		this.Price_Range = Price_Range;
	}
	//Get Method use
	public String GetCName() 
	{
		return Company_Name;
	}
	public String GetProcessor()
	{
		return Processor;
	}
	public String GetGeneration()
	{
		return Generation;
	}
	public int GetRam()
	{
		return RAM;
	}
	public int GetStorage()
	{
		return Storage;
	}
	public String GetPrice_Range()
	{
		return Price_Range;
	}
}
