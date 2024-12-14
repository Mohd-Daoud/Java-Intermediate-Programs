import java.util.Scanner;
class inverted2HalfPiramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int Number = sc.nextInt();
        for(int i = 1; i<=Number; i++)
        {
            for(int j = Number-1; j>=1; j--)
            {
                System.out.print("  ");
            }
            for(int k = 1; k<Number ; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
