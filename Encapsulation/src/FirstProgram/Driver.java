package FirstProgram;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Hakker CLass Is  Started ");
		System.out.println("\nget Method is stared ");
		SimplePoly d1 = new SimplePoly();
		d1.SetId(20); 	d1.SetName("Malik");
		System.out.println("\nnowget Method is stared ");
		System.out.println();
		System.out.println("Id Is : "+d1.GetId());
		System.out.println("Name Is : "+d1.GetName());
		
	}
}
