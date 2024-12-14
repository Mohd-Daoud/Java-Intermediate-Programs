import java.util.Scanner;
class alfabatesPattern2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number For Rows : ");
        int number = sc.nextInt();
        int star = 1;  
        for(int i = 1; i<=number; i++)
        {
            char C ='A';
            //to print Alfabates
            for(int j = 1 ; j<=star; j++)
            {
                System.out.print(C+" ");
                C++;
            }
            star++; 
            System.out.println();
        }
        sc.close();
    }
}