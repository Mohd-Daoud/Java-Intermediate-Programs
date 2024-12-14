import java.util.Scanner;
class numberPattern7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number For Rows : ");
        int number = sc.nextInt();
        int star = number;
        for(int i = 1; i<=number; i++)
        {
            //to print Numbers
            for(int j = 1 ; j<=star; j++)
            {
                System.out.print(i+" ");
            }
            star--;
            System.out.println();
        }
        sc.close();
    }
}