package traingingPersistent;

import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		int[] nos= {1,3,4,60,97,65,45,64,71,8};
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.print("Enter the number to find: ");
		num=scan.nextInt();
		int position=staticintfindPosition(num,nos);
		if(position==-1)
			System.out.println("Number not found.");
		else
			System.out.println("The element find at position: "+position);
	}

	static int staticintfindPosition(int num, int[] nos) {
		for(int i=0;i<nos.length;i++) {
			if(num==nos[i])
				return i+1;
		}
		return -1;
	}

}
