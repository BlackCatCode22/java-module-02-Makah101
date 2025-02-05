import java.util.Scanner;

public class MadnessWithMethods {
    public static int getAnIntFromTheUser() { // int is set to tell it an int will be returned.
         Scanner in = new Scanner(System.in);
         System.out.println("Enter an integer: ");
         int n = in.nextInt();
         return n;
    }

    public static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println("These numbers are equal");
        }
    }

    public static int sumTwoInts(int one, int two) {
        System.out.println("calculating sum of " + one + " and " + two + ".");
        return one + two;
    }

    public static void main(String[] args) {
        System.out.println ("Calling getAnIntFromTheUser.");   //calls the getAnIntFromTheUser method which returns the Integer
        int intFromTheUser = getAnIntFromTheUser();
        System.out.println ("You have entered " + intFromTheUser + ".");  // Prints out the Int to show it was returned.

        System.out.println ("Setting up for int comparison."); //calls getAnIntFromTheUser to get two integers.
        int firstInt = getAnIntFromTheUser();
        int secondInt = getAnIntFromTheUser();
        System.out.println ("Comparing " + firstInt + " and " + secondInt + "."); //for confirmation that the numbers are set.
        compareTwoInts(firstInt, secondInt); //calls compareTwoInts and passes on the integers.
        System.out.println ("Comparison complete."); //shows function was completed

        System.out.println ("Calling sumTwoInts.");
        int intA  = getAnIntFromTheUser();
        int intB = getAnIntFromTheUser();
        int intSum = sumTwoInts(intA, intB);
        System.out.println (intA + " + " + intB + " = " + intSum);
    }
}

