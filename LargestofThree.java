import java.util.Scanner;

public class LargestofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");  // asks user for three integers to compare
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest;            // will compare
        if (a >= b) {           // is A bigger then B
            if (a >= c) {       // is A also bigger then C
                largest = a;
            } else {            // A is bigger than B but not C
                largest = c;
            }
        } else {                // A is smaller then B
            if (b >= c) {       // is B bigger then C
                largest = b;
            } else {            // B is smaller then C
                largest = c;
            }
        }
        System.out.println(largest + " is the largest of " + a + " " + b + " and " + c);
    }
}
