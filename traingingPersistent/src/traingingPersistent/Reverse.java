package traingingPersistent;

public class Reverse {
	public static void main(String[] args) {
		String str="To be or not to be";
		String reverse = makeReverse(str);
		System.out.println(reverse);
	}

	static String makeReverse(String str) {
		String[] string=str.split(" ");
		String reverse="";
		for(int i=0;i<string.length;i++) {
			String word=string[i];
			for(int j=word.length()-1;j>=0;j--) {
				reverse += word.charAt(j);
			}
			reverse += " ";
		}
		return reverse;
	}
}
