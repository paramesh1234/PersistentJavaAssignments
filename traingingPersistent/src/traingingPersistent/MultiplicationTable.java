package traingingPersistent;

public class MultiplicationTable {

	public static void main(String[] args) {
		displayMultiplicationMatrix();
	}

	static void displayMultiplicationMatrix() {
		for (int i = 1; i <= 12; i++) {
			System.out.println("Number      Number      Product");
			for (int j = 1; j <= 12; j++) {
				System.out.println("  "+i+"          "+j+"            "+i*j);
			}
		}
	}

}
