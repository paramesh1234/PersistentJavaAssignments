package traingingPersistent;

public class FindMaximum {

	public static void main(String[] args) {
		int highValue = findLargest(10,30,20);
		System.out.println(highValue);
	}
	static int findLargest(int num1,int num2, int num3){//method definition
	    if(num1>=num2 && num1>=num3){
	        return num1;
	        
	    }
	    else if(num2>=num1 && num2>=num3){
	        return num2;
	        
	    }
	    else{
	    	return num3;
	    }
	    
	}

}
