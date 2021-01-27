package traingingPersistent;

import java.util.*;

public class CalculateInterest {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double amount;
	System.out.print("Enter the amount to deposit: ");
	amount = scan.nextDouble();
	System.out.println("The interest for the amount "+amount +" is "+callInterest(amount));
	}

	static double callInterest(double amount) {
		if(amount<=1000) {
			return amount*0.04;
		}
		else if(amount<=5000) {
			return amount*0.045;
		}
		else {
			return amount*0.05;
		}
	}
}
