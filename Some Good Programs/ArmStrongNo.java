import java.util.Scanner;
public class ArmStrongNo {
    static int count=0;
    static int number;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========:Check Number Is ArmStrongNo Or Not:=========");
        System.out.print("Enter Number : ");
        number = sc.nextInt();
        ArmStrongNo a1 = new ArmStrongNo();
        if(a1.isArmStrongNo(number))
            System.out.println(number+" is an ArmStrongNo");
        else
            System.out.println(number+" is Not an ArmStrongNo");
        //System.out.println("You Entered "+count+" Digit No");
    }
    public static int getCount(int number)
    {
        while (number>0) {
            count++;
            number = number/10;
        }
        return count;
    }
    public static int getPower(int a , int b)
    {
        int power = 1;
        for(int i = 1; i<=b; i++)
        {
            System.out.println("power is : "+power+" a is "+a );
            power = power*a;
            System.out.print("      result : "+power);
        }
        return power;
    }
    public static boolean isArmStrongNo(int number)
    {
        int orignalNo = number;
        int count = getCount(number);
        int sum = 0;
        while (number>0) 
        {
            int rem = number%10;
            sum = sum+getPower(rem, count);
            number = number/10;
        }
        return sum == orignalNo;
    }
}
