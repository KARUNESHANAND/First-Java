import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******SIMPLE INTEREST CALCULATOR******");
        System.out.println("Enter the Principal :  ");
        float P = sc.nextFloat();
        System.out.println("Enter the Rate :  ");
        float R = sc.nextFloat();
        System.out.println("Enter the Time in years :  ");
        float T = sc.nextFloat();
        float SI = (P*R*T/100);
        System.out.println("The simple interest is " + SI);
        float Sum = SI + P ;
        System.out.println("The total amount is : " + Sum);
    }
}
