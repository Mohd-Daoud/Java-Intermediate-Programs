import java.util.Scanner;
class numberPattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number For Rows : ");
        int number = sc.nextInt();
        int star = 1;
        for(int i = 0; i<=number; i++)
        {
            for(int j = 1 ; j<=star; j++)
            {
                System.out.print(i+" ");
            }
            star++;
            System.out.println();
        }
        sc.close();
    }
}