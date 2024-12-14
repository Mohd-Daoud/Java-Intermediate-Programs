import java.util.Scanner;
public class SchoolDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of Detail You Want to Add");
        System.out.println("To add only ==Name & Addess== press 1 OR To add ==Name , Adress , Established year , Student & Principal's Name== ");
        int x = sc.nextInt();
        
        if(x==1)
        {
            System.out.print("Enter School Name : ");
            String name2 = sc.nextLine();
            System.out.print("Enter School Address : ");
            String address = sc.nextLine();
            School obj = new School(name2, address);
        }else if(x==2)
        {
            System.out.print("Enter School Name : ");
            String name3 = sc.nextLine();
            System.out.print("Enter School Address : ");
            String address = sc.nextLine();
            System.out.print("Enter Principal's name : ");
            String pname = sc.nextLine();
            System.out.print("Enter Established year : ");
            int EstYear = sc.nextInt();
            System.out.print("Enter No Of Student : ");
            int noOfStudent = sc.nextInt();
            School obj = new School(name3, address, pname, EstYear, noOfStudent);
        }else System.out.println("please Enter Valid No : ");
        System.out.println();
        School obj = new School();
        obj.studentCounter();
        System.out.println("Program End");

    }
}
