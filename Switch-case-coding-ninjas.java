public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        if (ch<=1) {
            double radius = a[0];
            double areaofcircle = Math.PI * Math.pow(radius,2);
            return areaofcircle;  

        }
        else if (ch>1 & ch<=2) {
            double l = a[0];
            double b = a[1];
            double areaofrectangle = l*b;
            return areaofrectangle;
        }
        else {
            return -1;
        }
    }
}
