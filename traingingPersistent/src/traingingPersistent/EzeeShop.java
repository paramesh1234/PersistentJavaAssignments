package traingingPersistent;

import java.util.Scanner;
public class EzeeShop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String keyWord;
		String[] productsNames = initProductNames();
		System.out.println("Enter the key word to search: ");
		keyWord=scan.nextLine();
		boolean flag=staticbooleanisPresent(productsNames,keyWord);
		if(flag)
			System.out.println("Key word is present");
		else
			System.out.println("Key word is not present");
	}

	static boolean staticbooleanisPresent(String[] productsNames, String keyWord) {
		for(int i=0;i<productsNames.length;i++) {
			if(keyWord.toLowerCase().trim().equals(productsNames[i]))
				return true;
		}
		return false;
	}

	static String[] initProductNames() {
		String[] products= {"coffee","capachino","deserts","milkshakes","deserts"};
		return products;
	}

}
