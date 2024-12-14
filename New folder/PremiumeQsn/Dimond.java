import java.util.Scanner;

public class Dimond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = sc.nextInt();
        int star = 1, space = number-1;
        int mid = number/2 +1;
        for (int i = 1; i<= number; i++) {
            
            //to print topSpace
            for(int j = 1; j<=space ; j++)
            {
                System.out.print("  ");
            }
            // to print star
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            if (i<mid) {
                star+=2;     space--;
            }else{
                star-=2;     space++;

            }
            System.out.println();
        }
    }
}
