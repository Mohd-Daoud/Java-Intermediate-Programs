	package Question;
	import java.util.Scanner;
	public class CountArmStrong {
		static int digits = 0;
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter A Last Number Of Range : ");
			int number =sc.nextInt();
			int count = 0;
//			isArmStrong s1 = new isArmStrong();
			for(int i = 1; i<=number; i++)
			{
				if (ArmStrong(i)) {
					System.out.print(i+" ");
					count++;
				}
			}		
			System.out.println("\nTotal ArmStrong Numbers Are : "+count);
//			if (ArmStrong(number))
//				System.out.println(number + " Is an ArmStrong Number");
//			else
//				System.out.println(number + " Is Not an ArmStrong Number");
			
		}
		public static boolean ArmStrong(int number)
		{
			int remander;
			int power = countDigit(number);
			int OrignalNo = number , result = 0;
			while(number > 0)
			{
				remander = number%10;
				result += (int)Math.pow(remander, power);
				number = number/10;
			}
			if (result==OrignalNo)
				return true;
			else
				return false;
			
		}
		public static int countDigit(int number)
		{ 
			while(number>0)
			{
				number = number/10;
				digits++;
			}
			return digits;
		}
}
