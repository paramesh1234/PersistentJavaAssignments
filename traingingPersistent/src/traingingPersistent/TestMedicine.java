package traingingPersistent;

//import java.util.Random;

class Medicine{
	String Name;
	String Address;
	public Medicine(String Name,String Address) {
		this.Name=Name;
		this.Address=Address;
	}
	void displayLabel() {
		System.out.println("The medicine name is: "+Name);
	}
}
class Tablet extends Medicine{
	public Tablet(String Name, String Address) {
		super(Name, Address);
	}

	void displayLabel() {
		System.out.println("store in a cool dry place");
	}
}
class Syrup extends Medicine{
	public Syrup(String Name, String Address) {
		super(Name, Address);
	}

	void displayLabel() {
		System.out.println("Only use for cough.");
	}
}
class Ointment extends Medicine{
	public Ointment(String Name, String Address) {
		super(Name, Address);
	}

	void displayLabel() {
		System.out.println("for external use only");
	}
}
public class TestMedicine {

	public static void main(String[] args) {
	Medicine[] m=new Medicine[5];
	m[0]=new Medicine("cipla","delhi");
	m[1]=new Medicine("syrup","dehradun");
	m[2]=new Medicine("move","hyderabad");
	m[3]=new Medicine("paracetamul","new york");
	m[4]=new Medicine("otrivin","uk");
	for(int i=0;i<m.length;i++) {
		int r=getRandomNumber(1, 4);
		if(r==1) {
			Medicine medicine=new Tablet(m[i].Name,m[i].Address);
			medicine.displayLabel();
		}
		else if(r==2) {
			Medicine medicine=new Syrup(m[i].Name,m[i].Address);
			medicine.displayLabel();
		}
		else if(r==3) {
			Medicine medicine=new Ointment(m[i].Name,m[i].Address);
			medicine.displayLabel();
		}
	}	
	}
	public static int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
