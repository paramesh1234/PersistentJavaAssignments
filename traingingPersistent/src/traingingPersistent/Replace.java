package traingingPersistent;

public class Replace {

	public static void main(String[] args) {
		String sentence = "one two three five Two you me tWo";
		String find="two";
		String replace = "change";
		String[] string = sentence.split(" ");
		String result="";
		for(int i=0;i<string.length;i++) {
			if(find.toLowerCase().equals(string[i].toLowerCase()))
				result += replace;
			else
				result += string[i];
			result += " ";
		}
		System.out.println(result);
	}

}
