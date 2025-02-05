import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  //sets s as the user input
        String reversed = "";  //sets a string for the result and leaves it empty

        //sets int to the legnth of s , as long as 'i' is greater-then or equal to 0 it runs , subtracts 1 from 'i',
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);   // takes the character at 'i' and places it into 'reversed' from last to first.
        }
        System.out.println(reversed);   // types out the results.
    }
}
