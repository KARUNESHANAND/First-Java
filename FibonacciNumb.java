import java.util.*;
import java.util.Scanner;
public class FibonacciNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fibonacci number : ");
        int fibN = sc.nextInt();
        int numb_1 = 0;
        int numb_2 = 1;
        int temp = 0;
        for (int i = 1 ; i < fibN ; i++  ){
            temp = numb_1 + numb_2;
            numb_1 = numb_2;
            numb_2 = temp;
        }
        System.out.println(temp);
    }
}
