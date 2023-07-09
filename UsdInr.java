import java.util.*;
public class UsdInr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency that you want to be converted to. Type either 'USD' or 'INR' : ");
        String convert = sc.nextLine();
        if(convert.equals("INR")) {
            System.out.println("Enter the amount to be converted to INR from USD : ");
            double amount = sc.nextDouble();
            double converted = amount * 82.34;
            System.out.println("The converted amount in USD is : " + converted);


        }
        else if(convert.equals("USD")) {
            System.out.println("Enter the amount to be converted to USD from INR : ");
            double amount = sc.nextDouble();
            double converted = amount / 82.34;
            System.out.println("The converted amount in INR is : " + converted);
        }
        else {
            System.out.println("Enter a valid info either INR OR USD");
        }
    }
}
