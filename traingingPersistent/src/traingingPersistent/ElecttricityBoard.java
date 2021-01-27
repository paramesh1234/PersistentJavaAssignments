package traingingPersistent;

import java.util.Scanner;

public class ElecttricityBoard {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int units,choice;
		System.out.print("Enter number of units: ");
		units=scan.nextInt();
		System.out.println("Type of connections: ");
		System.out.println("1. Domestic\n2. Commercial");
		System.out.print("Enter your choice: ");
		choice=scan.nextInt();
		if(choice==1) {
			if(units<=100)
				System.out.println("The electricity bill is: "+250);
			else if(units<=300)
				System.out.println("The electricity bill is: "+units*4.5);
			else if(units<=500)
				System.out.println("The electricity bill is: "+units*4.75);
			else
				System.out.println("The electricity bill is: "+units*5);
		}
		else if(choice==2) {
			if(units<=100)
				System.out.println("The electricity bill is: "+350);
			else if(units<=300)
				System.out.println("The electricity bill is: "+units*4.75);
			else if(units<=500)
				System.out.println("The electricity bill is: "+units*5);
			else
				System.out.println("The electricity bill is: "+units*5.25);
		}
		else
			System.out.println("Wrong choice");
	}

}
