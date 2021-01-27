package traingingPersistent;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double amount;
		System.out.print("Enter the amount: ");
		amount = scan.nextDouble();
		System.out.println("The interest for the amount "+amount +" is $"+calTax(amount));
	}

	static double calTax(double amount) {
		if(amount<=240) {
			return 0;
		}
		else if(amount<480) {
			return amount*0.15;
		}
		else {
			return amount*0.28;
		}
	}

}
