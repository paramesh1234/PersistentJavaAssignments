package traingingPersistent;

public class EvenAndMultiple {

	public static void main(String[] args) {
		int[] array= {1,20,30,44,57,88,90};
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0 && array[i]%5==0)
				System.out.println(array[i]);
		}
	}

}
