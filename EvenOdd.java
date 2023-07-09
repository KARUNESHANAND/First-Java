import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number to be checked : ");
        int check_numb = sc.nextInt();

        if (check_numb%2 == 0) {
            System.out.println(check_numb + " is a even number.");
        }
        else {
            System.out.println(check_numb + " is a odd number.");
        }

    }
}
