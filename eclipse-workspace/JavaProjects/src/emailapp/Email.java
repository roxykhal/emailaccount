package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String email;
	private String companySuffix = "company.com";
	
	//constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		
		//call method asking for the department - return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//call a method that returns a random password
		this.password = randomPassword(8);
		System.out.println("Your password is " + this.password);
		
		
		//combine elements to generate email
		email = firstName.toLowerCase()+ lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your email is " + email);
		
		
	}
	
	
	//ask for department 
	
	private String setDepartment() {
		
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1) {return "Sales";}
		
		else if (depChoice == 2) {return "Dev";}
		
		else if (depChoice == 3) {return "Accounting";}
		
		else {return "";}
		
	}
	
	
	//random password generator 
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@$%";
		
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			
			//math.random is between 0-1 so * by password length ^ and make it an integer and store it in a random value (rand)
			
		int rand =	(int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
 	}
	
	
	//set mailbox capacity
	
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	
	
	//set alternate email address
	
	public void setAlernateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change password
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() 
	{return mailboxCapacity;}
	
	public String getAlternateEmail() 
	{return alternateEmail;}
	
	public String getPassword()
	{return password;}
	

	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
		"Company email: " + email + 
		"Mailbox capacity" + mailboxCapacity + "mb";
	}
	}
