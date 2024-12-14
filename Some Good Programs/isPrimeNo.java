package Question;
import java.util.Scanner;
public class isPrimeNo{
	 public static void main(String[] arg)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The Range ");
		 int range = sc.nextInt();
		 int count = 0;
		 for(int i=2; i<range; i++)
		 {
			 if(isPrime(i))
			 {
				 System.out.print(i+" ");
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
