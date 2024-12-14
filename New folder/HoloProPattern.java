import java.util.Scanner;

public class HoloProPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        for(int i = 1; i<=number; i++)
        {
            for(int j = 1; j<=number ; j++)
            {
                if (i<=3 || i>=number-2 || j<=3 || j>=number-2) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



