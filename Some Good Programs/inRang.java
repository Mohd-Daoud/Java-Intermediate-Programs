package Question;

import java.util.Scanner;

public class inRang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Start Range No : ");
		int start = sc.nextInt();
		 System.out.print("Enter The End Range No : ");
		 int End = sc.nextInt();
		 int count = 0;
		 for(int i=start; i<=End; i++)
		 {
			 if(isPrime(i))
			 {
				 System.out.print(i+" ")
				 count++;
			 }
		 }
		 System.out.println("\nTotal Numbers Are : "+count);
	 }
	 public static boolean isPrime(int n) {
		 if(n<2)
			 return false;
		 for(int i = 2; i*i<=n; i++) {
			 if(n%i==0)
				 return false;
		 }
		return true;
	 }

}

