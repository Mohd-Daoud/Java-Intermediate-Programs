import java.util.Scanner;

public class MixPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number For Rows : ");
        int number = sc.nextInt();
        int star = number;
        int AllNumber = number;
        int topSpace = 2 * number;
        int StartNo = 1;
        char c = 'Z';
        char ch = 'z';
        for (int i = 1; i <= number; i++) {
            // to print Numbers
            for (int j = AllNumber; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // to print topSpace

            for (int j = 1; j <= topSpace; j++) {
                System.out.print("  ");
            }
            // to print alfabates (c)

            for (int j = AllNumber; j >= 1; j--) {
                System.out.print(c + " ");
                c--;
            }

            AllNumber--;
            topSpace += 2;
            System.out.println();
        }

        // for (int i = 1; i <= number; i++) {

        // System.out.println();
        // }
        int Dstar = 1, Dspace = number - 1;
        int Dmid = number / 2 + 1;
        for (int i = 1; i <= number; i++) {

            // to print topSpace
            for (int j = 1; j <= Dspace; j++) {
                System.out.print("  ");
            }
            // to print star
            for (int j = 1; j <= Dstar; j++) {
                System.out.print("* ");
            }
            if (i < Dmid) {
                Dstar += 2;
                Dspace--;
            } else {
                Dstar -= 2;
                Dspace++;

            }
            System.out.println();
        }

        for (int i = 1; i <= number; i++) {
            // start Number Print , StartNo=1
            for (int j = 1; j <= StartNo; j++) {
                System.out.print(StartNo + " ");
            }
            // to print BottomSpace (space)
            for (int j = 1; j <= topSpace; j++) {
                System.out.print("  ");
            }
            for (int j = AllNumber; j >= 1; j--) {
                // to print charater (ch)
                System.out.print(ch + " ");
                ch++;
            }
            StartNo++;
            System.out.println();
        }
        sc.close();
    }
}
