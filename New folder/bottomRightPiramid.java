import java.util.Scanner;

public class bottomRightPiramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = sc.nextInt();
        int star = number, space = 0;
        for(int i = 1; i<=number; i++)
        {
            //to print space
            for(int j = 1; j<=space ; j++)
            {
                System.out.print("  ");
            }
            //to print star
            for(int j = 1; j<=star; j++)
            {
                System.out.print("* ");
            }
            star--; space++;
            System.out.println();
        }
    }
}
