import java.util.Scanner;
public class RectangleDriver {
    public static void main(String[] args) {
        System.out.println("=======: Main Software is Started :=======");
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println();
        System.out.print("Enter the Width of Rectangle : ");
        int w = sc.nextInt();
        System.out.print("Enter the Length Of Rectangle : ");
        int l = sc.nextInt();
        System.out.println();
        r1.setValue(w, l);
        System.out.println("===========Details==========");
        r1.getDetails();
        System.out.println();
        System.out.println("===========Area==========");
        r1.getArea();
    }
}
