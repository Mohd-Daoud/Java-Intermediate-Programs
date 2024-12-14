import java.util.Scanner;
public class CalculatorDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("        =====:Which Opration You Want to Perform Press Realted No:=====");
        System.out.println("For Addition        : 1");
        System.out.println("For Subtraction     : 2");
        System.out.println("For Multiplication  : 3`");
        System.out.println("For Division        : 4");
        System.out.println();
        System.out.print("Enter No : ");
        int number1 = sc.nextInt();
        if (number1==1) {
            System.out.println("        ----:How Many No You Want To Add:----");
            System.out.println("For 1 Value : 1");
            System.out.println("For 2 Value : 2");
            System.out.println("For 3 Value : 3");
            System.out.println("For 4 Value : 4");
            System.out.println("For 5 Value : 5");
            System.out.println();
            System.out.print("Enter You Choice : ");
            int number2 = sc.nextInt();
            if(number2==1){
                System.out.print("Enter your value : ");
                int value1 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.add(value1));
            }else if (number2 == 2){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.add(value1, value2));
            }else if (number2 == 3){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.print("Enter your 3rd value : ");
                int value3 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.add(value1, value2, value3));
            }else if (number2 == 4){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.print("Enter your 3rd value : ");
                int value3 = sc.nextInt();
                System.out.print("Enter your 4th value : ");
                int value4 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.add(value1, value2, value3, value4));
            }else if (number2 == 5){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.print("Enter your 3rd value : ");
                int value3 = sc.nextInt();
                System.out.print("Enter your 4th value : ");
                int value4 = sc.nextInt();
                System.out.print("Enter your 5th value : ");
                int value5 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.add(value1, value2, value3, value4, value5));
            }
        }else if (number1==2) {
            System.out.println("        ----:How Many No You Want To Subtract:----");
            System.out.println("For 1 Value : 1");
            System.out.println("For 2 Value : 2");
            System.out.println("For 3 Value : 3");
            System.out.println("For 4 Value : 4");
            System.out.println();
            System.out.print("Enter You Choice : ");
            int number2 = sc.nextInt();
            if(number2==1){
                System.out.print("Enter your value : ");
                int value1 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.sub(value1));
            }else if (number2 == 2){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.sub(value1, value2));
            }else if (number2 == 3){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.print("Enter your 3rd value : ");
                int value3 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.sub(value1, value2, value3));
            }else if (number2 == 4){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.print("Enter your 3rd value : ");
                int value3 = sc.nextInt();
                System.out.print("Enter your 4th value : ");
                int value4 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.sub(value1, value2, value3, value4));
            }
        }else if (number1==3) {
            System.out.println("        ----:How Many No You Want To Multiply:----");
            System.out.println("For 1 Value : 1");
            System.out.println("For 2 Value : 2");
            System.out.println("For 3 Value : 3");
            System.out.println("For 4 Value : 4");
            System.out.println();
            System.out.print("Enter You Choice : ");
            int number2 = sc.nextInt();
            if(number2==1){
                System.out.print("Enter your value : ");
                int value1 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.mul(value1));
            }else if (number2 == 2){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.mul(value1, value2));
            }else if (number2 == 3){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.print("Enter your 3rd value : ");
                int value3 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.mul(value1, value2, value3));
            }else if (number2 == 4){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.print("Enter your 3rd value : ");
                int value3 = sc.nextInt();
                System.out.print("Enter your 4th value : ");
                int value4 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.mul(value1, value2, value3, value4));
            }
        }else if (number1==4) {
            System.out.println("        ----:How Many No You Want To Divide:----");
            System.out.println("For 1 Value : 1");
            System.out.println("For 2 Value : 2");
            System.out.println("For 3 Value : 3");
            System.out.println("For 4 Value : 4");
            System.out.println();
            System.out.print("Enter You Choice : ");
            int number2 = sc.nextInt();
            if(number2==1){
                System.out.print("Enter your value : ");
                int value1 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.div(value1));
            }else if (number2 == 2){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.div(value1, value2));
            }else if (number2 == 3){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.print("Enter your 3rd value : ");
                int value3 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.div(value1, value2, value3));
            }else if (number2 == 4){
                System.out.print("Enter your 1st value : ");
                int value1 = sc.nextInt();
                System.out.print("Enter your 2nd value : ");
                int value2 = sc.nextInt();
                System.out.print("Enter your 3rd value : ");
                int value3 = sc.nextInt();
                System.out.print("Enter your 4th value : ");
                int value4 = sc.nextInt();
                System.out.println();
                System.out.println("Sum : "+Calculator.div(value1, value2, value3, value4));
            }else{
                System.out.print("You Enter InValid Number please Try Again: ");

            }
        }else{
            System.out.print("Please Enter Valid Number : ");
            main(args);
        }
        System.out.println();
        System.out.println("Program Ends");
    }
}
