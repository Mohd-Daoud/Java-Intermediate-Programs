package FirstProgram;

public class LapDriver {
	public static void main(String[] args) {
		System.out.println("Main Method Is Started ");
		System.out.println();
		LaptopPoly l1 = new LaptopPoly();
		System.out.println("All Values Are Set");
		l1.SetCName("Dell"); 	l1.SetProcessor("Intel Core i7");	l1.SetGeneration("11th Gen"); 
		l1.SetRam(16);	l1.SetStorage(2048);	l1.SetPrice_Range("79,500 - 299,500");
		
		System.out.println("\nGet Method Started");
		System.out.println("Company Name Is	: "+l1.GetCName());
		System.out.println("Processor Is : "+l1.GetProcessor());
		System.out.println("Generation Is : "+l1.GetGeneration());
		System.out.println("RAM Is : "+l1.GetRam()+" GB DDR4");
		System.out.println("Storage Is : "+l1.GetStorage()+" GB NVMe SSD");
		System.out.println("Price Range Is : "+l1.GetPrice_Range());
		
		
	}
}
