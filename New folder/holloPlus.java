import java.util.Scanner;

public class holloPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Must Odd : ");
        int number = sc.nextInt();
        int mid = number/2+1;
        for(int i = 1; i<=number; i++)
        {
            for(int j = 1; j<=number ; j++)
            {
                if (i==1 || i==number || j==1 || j==number||j==mid || i==mid) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

