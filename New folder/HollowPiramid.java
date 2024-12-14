import java.util.Scanner;

public class HollowPiramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = sc.nextInt();
        int star = number;
        for(int i = 1; i<=number; i++)
        {
            //to print dec star
            for(int j = 1; j<=star; j++)
            {
                System.out.print("* ");
            }
            star--;  
            System.out.println();
        }
        for(int i = 1; i<=number; i++)
        {
            //to print inc star
            for(int j = 1; j<=star+2; j++)
            {
                System.out.print("* ");
            }
            star++;
            System.out.println();
        }
        //
    }
}
