import java.util.Scanner;

public class crosBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number must odd : ");
        int number = sc.nextInt();
       
        for(int i = 1; i<=number; i++)
        {
            for(int j = 1; j<=number ; j++)
            {
                if (i==1||i==number||j==1||j==number||i==j||i+j==number+1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}



