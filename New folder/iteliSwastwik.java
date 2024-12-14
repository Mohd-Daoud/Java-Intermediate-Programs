import java.util.Scanner;

public class iteliSwastwik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number must odd : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i+j==number+1 && i>4&& i<number-3||i==j&&i>4&&i<number-3 ||i+j==number-9 &&i>number/4||i+j==number+11&&i<number-4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
