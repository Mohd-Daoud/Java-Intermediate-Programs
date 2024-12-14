import java.util.Scanner;
class invertedHalfPiramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int Number = sc.nextInt();
        int mid = Number/2+1;
        for(int i = 1; i<=Number; i++ )
        {
            for(int j = Number; j>=1; j--)
            {
                if (j>=i) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}