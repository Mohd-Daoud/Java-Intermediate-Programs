import java.util.Scanner;
class halfPiramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int Number = sc.nextInt();
        int mid = Number/2+1;
        for(int i = 1; i<=Number; i++ )
        {
            for(int j = 1; j<=Number; j++)
            {
                if (j<=i) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}