import java.util.Scanner;

public class oppositSwastik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number must odd : ");
        int number = sc.nextInt();
        int mid = number/2+1;
       
        for(int i = 1; i<=number; i++)
        {
            for(int j = 1; j<=number ; j++)
            {
                if (i==mid||j==mid||i==1&&j<mid || j==number&&i<mid||i==number&&j>mid||j==1&&i>mid) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



