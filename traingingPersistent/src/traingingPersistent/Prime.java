package traingingPersistent;

public class Prime {

	public static void main(String[] args) {
		boolean flag = booleanIsPrimeNumber(1);
		if(flag)
			System.out.println("It is prime");
		else
			System.out.println("It is not prime");
	}

    static boolean booleanIsPrimeNumber(int n) 
    { 
        if (n <= 1) 
            return false; 
  
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 

}
