package FirstProgram;

public class PinkuDriver {
	public static void main(String[] args) {
		System.out.println("Values is Set");
		Pinku pd = new Pinku();
		pd.SetName("Pinku"); pd.SetIdNo(43);
		System.out.println("Get Methods Called");
		System.out.println("Name is : "+pd.GetName());
		System.out.println("ID No is : "+pd.GetId());
	}
}
