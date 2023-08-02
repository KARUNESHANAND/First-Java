import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numb = sc.nextLine();
		if(numb=="0"){
			System.out.println(0);
		}
		else {
			int length = String.valueOf(numb).length();
			// System.out.println(length);
			int sum1 = 0;
			int sum2 = 0;
			int i = 0;
			while(i<=(length-1)) {
				int foo = Character.getNumericValue(numb.charAt(i));
				if(foo%2==0) {
					sum1= sum1 + foo;
				}
				else if(foo%2 != 0){
					sum2 = sum2 + foo;
				}
				i++;
			}
			// System.out.println(sum1);
			// System.out.println(sum2);
			System.out.print(sum1 +" "+sum2);

		}
	}
}
