import java.util.Scanner;
class pattern1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
            int number = sc.nextInt();
            for(int i = 0; i <= number; i++)
            {
                for(int j = 0; j <= number; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
                
            }
    }
}