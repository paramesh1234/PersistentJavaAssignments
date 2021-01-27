package traingingPersistent;

import java.util.Scanner;

public class StringPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		System.out.print("Enter string: ");
		str=scan.nextLine();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
