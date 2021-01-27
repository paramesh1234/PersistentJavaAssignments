package com.psl.training.e1;

import java.sql.Date;

public class Tester {
	public static void main(String[] args) throws Exception{
		try {
		Contact c1=new Contact("fet","Paramesh","Reddy","male","Mittamadi","Proddatrur",
				"516360","AP","India","1454564","65449849","parameshwer@98gmail.com","helper.com",Date.valueOf("1998-07-28"),Date.valueOf("2022-10-10"));
		
			c1.validate(c1.getFirstName(), c1.getLastName(), c1.getDateOfBirth(), c1.getEmail(),
					c1.getTelephoneNumber(), c1.getMobileNumber());
		}
		catch (FirstNameException e) {
			System.out.println(e);
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		catch(SyntaxWrong e) {
			System.out.println(e);
		}
	}
}
