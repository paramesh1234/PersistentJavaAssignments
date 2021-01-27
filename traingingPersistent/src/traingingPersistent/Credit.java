package traingingPersistent;

import java.util.Scanner;

public class Credit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float amount;
		System.out.print("Enter the charge amount: ");
		amount = scan.nextFloat();
		System.out.println("The pay back amount is: "+payBackAmount(amount));
	}

	static float payBackAmount(float amount) {
		float payBack=0.0f,money;
		if(amount<=500) {
			return (float) (0.25*0.01*amount);
		}
		else if(amount<=1500) {
			payBack += 500*0.25*0.01;
			amount -= 500;
			return (float) (payBack+(0.5*0.01*amount));
		}
		else if(amount<=2500) {
			payBack += 500*0.25*0.01;
			amount -= 500;
			return (float) (payBack+(0.75*0.01*amount));
		}
		else {
			payBack += 500*0.25*0.01;
			amount -= 500;
			return (float) (payBack+(1*0.01*amount));
		}
	}

}
