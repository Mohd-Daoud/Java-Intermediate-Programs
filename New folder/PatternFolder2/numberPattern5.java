import java.util.Scanner;
class numberPattern5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number For Rows : ");
        int number = sc.nextInt();
        int star = 1, space= number;
        for(int i = 0; i<=number; i++)
        {
            //to print space
            for(int j = 1 ; j<=space; j++)
            {
                System.out.print("  ");
            }
            //to print Numbers
            for(int j = 1 ; j<=star; j++)
            {
                System.out.print((i+j)%2+" ");
            }
            
            star++;     space--;
            System.out.println();
        }
        sc.close();
    }
}