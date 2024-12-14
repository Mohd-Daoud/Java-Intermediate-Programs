package Multiple;

public interface ABCDriver {
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println("\n====================");
		c1.start();
		c1.test();
		System.out.println("\n====================");
		c1.demo();
		c1.test();
	}
	 
}
