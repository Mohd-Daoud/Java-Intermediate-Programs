package MethodChain;

public class ChainDriver {
	public static void main(String[] args) {
		methodChaining c1 = new methodChaining("Malik",12,12302.45,23);
		methodChaining c2 = new methodChaining("Aashu",15,30232.35,26);
		methodChaining c3 = new methodChaining("Rahil",17,32302.12,40);
//		methodChaining c2 = new methodChaining("Malik");
		c1.getage().getName().getsalary();
		System.out.println("-----------------");
		c2.getage().getsalary().getid();
		System.out.println("-----------------");
		c3.getage().getsalary();
		System.out.println("-----------------");
		c1.getage().getName().getsalary().getid();
	}
}
