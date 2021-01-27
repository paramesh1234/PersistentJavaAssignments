package traingingPersistent;

public class OccurenceOfWord {

	public static void main(String[] args) {
		String sentence = "one two three five Two you me tWo";
		String word = "twO";
		System.out.println("The word " + word + " occurs " + check(sentence,word) + " times in the above string");
	}

	static int check(String sentence, String word) {
		String temp[] = sentence.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
		if (word.toLowerCase().equals(temp[i].toLowerCase()))
		count++;
		}
		return count;
	}

}
