import java.util.Scanner;

public class printStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = sc.nextInt();
        number/=2;
        int star = number, space = 0;


        //for iner Star And Space
        int inerStar = 2*number+7;
        int inerSpace = 0;
        
        //for top of star
        int topSpace = number, topStar = 1;
        for(int i = 1; i<=number; i++)
        {
            //to print space
            //here number => space
            for(int j=topSpace+3; j>=1; j--)
            {
                System.out.print("  ");
            }
            //to print star
            for(int j = 1; j<=topStar;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            topSpace--;  topStar +=2;
        }

        for(int i = 1; i<=4; i++)
        {
            //to print space
            for(int j = 1; j <= inerSpace; j++ )
            {
                System.out.print("  ");
            }
            //to ptint star lines
            for(int j = 1; j <= inerStar; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
            
            inerStar-=2;      inerSpace++;  
        }
        for (int i = 1; i <= number; i++) {
            

            //to print space
            for(int j=1;j<=3;j++){
                System.out.print("  ");
            }
            
            //to print star
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            //to print space
            for(int j=1;j<=space;j++){
                System.out.print("    ");
            }
            //to print star
            for(int j=1; j<=star; j++)
            {
                System.out.print("* ");
            }
            star--; space++;
            System.out.println();
            
            
        }
    }
    
}