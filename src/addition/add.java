package addition;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		Scanner readme = new Scanner(System.in);
		   System.out.println("Enter Two Numbers (Press Enter after each):");
		   //two variables to hold numbers
		   double n1, n2, add, sub, mul ,div;
		   n1 = readme.nextDouble();
		   n2 = readme.nextDouble();
		   add = n1 + n2;
		   System.out.println("Addition = " + add);
		   sub = n1 - n2;
		   System.out.println("Sub =" + sub);
		   mul = n1 * n2;
		   System.out.println("Mul =" + mul);
		   div =n1/n2;
		   System.out.println("div =" +div);
		   

	}

}
