package traingingPersistent;


public class Combinations { 

	static void printPermutn(String str, String ans) 
	{ 

		if (str.length() == 0) { 
			System.out.println(ans + " "); 
			return; 
		} 

		for (int i = 0; i < str.length(); i++) { 

			char ch = str.charAt(i); 

			//System.out.println(str.substring(0,i)+" "+str.substring(i+1)+" jjj");
			//System.out.println(i+" i value");
			String ros = str.substring(0, i) + 
						str.substring(i + 1); 

			
			printPermutn(ros, ans + ch); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		String s = "112"; 
		printPermutn(s, ""); 
	} 
} 
