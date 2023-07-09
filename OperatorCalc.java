import java.util.*;
public class OperatorCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double num_1 = sc.nextInt();
        System.out.println("Enter the first number : ");
        double num_2 = sc.nextInt();
        System.out.println("enter any of the (+,-,*,/)  operators : ");
        char operator = sc.next().charAt(0);

        if(operator == '+'){
            double sum = num_1 + num_2;
            System.out.println("The sum of the numbers is : " + sum);
        }
        else if(operator == '-'){
            double subtract = num_1 - num_2;
            System.out.println("The sum of the numbers is : " + subtract);
        }
        else if(operator == '*'){
            double mul = num_1 * num_2;
            System.out.println("The sum of the numbers is : " + mul);
        }
        else if(operator == '/'){
            double div = num_1 / num_2;
            System.out.println("The sum of the numbers is : " + div);
        }
        else {
            System.out.println("Please enter a valid operator.......");
        }

    }
}
