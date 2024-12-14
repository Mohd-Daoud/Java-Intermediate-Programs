import java.util.Scanner;
public class Piramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A  Odd Number : ");
        int number = sc.nextInt();
        Piramid.topPiramid(number);
        
    }
    public static void topPiramid(int number)
    {
        if (number%2==0) {
            System.out.println("Must Entered Value shoud be Odd");
            return;
        }
        int star = 1,  mid = number/2 +1,  space = number/2;
        for(int i = 1; i<=number ;i++)
        {
            //to print space
            for(int j = 1; j<=space; j++)
            {
                System.out.print("  ");
            }
            //to print star
            for(int j = 1; j<=star; j++)
            {
                System.out.print("* ");
            }
            if (i<mid) {
                star+=2;     space--;
            }else{
                star-=2;    space++;
            }
            
            System.out.println();
        }
        
    } 
}
