package traingingPersistent;
//import java.lang.*;
public class Vowel {

	public static void main(String[] args) {
		boolean flag = booleanCheckAlpha('G');
		if(flag==true)
			System.out.println("It is vowel");
		else
			System.out.println("It is not a vowel");
	}

	static boolean booleanCheckAlpha(char c) {
		char ch= Character.toLowerCase(c);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			return true;
		else
			return false;
	}

}
