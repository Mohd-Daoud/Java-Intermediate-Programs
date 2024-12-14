import java.util.Scanner;

public class powerprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
    }

    public static int getPower(int a, int b) {
        int power = 1;
        for (int i = 1; i <= b; i++) {
            System.out.println("power is : " + power + " a is " + a);
            power = power * a;
            System.out.print("      result : " + power);
        }
        return power;

    }
}
