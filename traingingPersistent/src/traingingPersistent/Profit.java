package traingingPersistent;

import java.util.Scanner;

public class Profit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int attendes;
		System.out.print("Enter number of attendes: ");
		attendes=scan.nextInt();
		System.out.println("The show earns: "+calculateProfit(attendes));

	}

	static float calculateProfit(int attendes) {
		return (float) ((attendes*5)-(20+(attendes*0.5)));
	}

}
