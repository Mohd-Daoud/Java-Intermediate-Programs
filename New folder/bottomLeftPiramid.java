import java.util.Scanner;
public class bottomLeftPiramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = sc.nextInt();
        int star = number;
        for(int i = 1; i<=number; i++)
        {
            for(int j = 1; j<=star; j++)
            {
                System.out.print("* ");
            }
            star--;
            System.out.println();
        }
    }
    
}