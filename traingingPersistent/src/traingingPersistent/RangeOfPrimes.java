package traingingPersistent;

import java.util.Scanner;

public class RangeOfPrimes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int val;
		System.out.print("Enter max value: ");
		val=scan.nextInt();
		System.out.println("The prime number are: ");
		printPrime(val);
	}

	static void printPrime(int val) {
		for(int i=2;i<=val;i++) {
			int flag=0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(i);
	            
		}
	}

}
