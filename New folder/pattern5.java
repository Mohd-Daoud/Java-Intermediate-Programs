import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Must Odd : ");
        int number = sc.nextInt();
        int mid = (number/2) +1;
        System.out.println("Mid is "+mid);
        for(int i = 1; i<=number; i++)
        {
            for(int j = 1; j<=number ; j++)
            {
                if (i==mid||j==mid) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
