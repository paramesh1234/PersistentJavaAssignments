package traingingPersistent;

public class StringCount {

	public static void main(String[] args) {
	String str="me its nog know tredu stgf  gjdjkk KKdurhor";
	int characters=0,vowels=0,spaces=0;
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)==' ')
			spaces += 1;
		if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<='Z'))
			characters += 1;
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o'
				|| str.charAt(i)=='u'|| str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'
				|| str.charAt(i)=='O'|| str.charAt(i)=='U')
			vowels += 1;
	}
	System.out.println("TOtal number of characters: "+characters);
	System.out.println("TOtal number of vowels: "+vowels);
	System.out.println("TOtal number of spaces: "+spaces);
	}

}
