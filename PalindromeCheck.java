import java.util.*;
import java.lang.String;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is a palindrome : ");
        String checkString = sc.next();
        String revString = "";
        int strLength =  checkString.length();
        System.out.println("The length of the string is " + strLength);
        for(int i = strLength -1 ; i >= 0; i--) {
            revString = revString + checkString.charAt(i);
        }
        System.out.println(revString);
        if (checkString.toLowerCase().equals(revString.toLowerCase())) {
            System.out.println(checkString + " is a palindrome.");
        }
        else {
            System.out.println(checkString + " is not a palindrome");
        }
    }
}
