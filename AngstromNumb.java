import java.util.*;
public class AngstromNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number from where: ");
        int numb_1 = sc.nextInt();
        System.out.println("Enter the second number till where: ");
        int numb_2 = sc.nextInt();
        for(int number = numb_1 + 1 ; number <= numb_2 ; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;
            while( originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }
            if(result == number) {
                System.out.print(number + " ");
            }
        }


    }
}
