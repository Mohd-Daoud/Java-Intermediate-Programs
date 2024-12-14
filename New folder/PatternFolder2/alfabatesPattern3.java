import java.util.Scanner;
class alfabatesPattern3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number For Rows : ");
        int number = sc.nextInt();
        int star = 1;  char C ='A';
        for(int i = 1; i<=number; i++)
        {
            
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