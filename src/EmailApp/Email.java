package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private int defaultpasswordLenght=8;
	private String companySuffix="kaligia.com";
	//constructor to retrive first and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created : "+this.firstName+" "+this.lastName);
		//calling method asking for department-return the deparmtent
		
		this.department=setdepartment();
		System.out.println("Department : "+this.department);
		
		//call method which retrun random password
		this.password=randomPassword(defaultpasswordLenght);
		System.out.println("Your password is : "+this.password);
		
		//combine elements to genarate email
		email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your email is : "+email);
	} 
	//ask for department
	
	private String setdepartment() 
	{
		System.out.print("Enter the department Codes : \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none \nEnter Department Code : ");
		Scanner in=new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==2) {return "acct";}
		else {return "none";}
	}
	//generate random password
	
	private String randomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@.";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
		int rand=	(int) (Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
		}
	return new String(password) ;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	//set mail box capacity
	
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	//set alternate email

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	
	//change password
	public void changePassword(String password)
	{
		this.password=password;
	}

	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getalternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo()
	{
		return "DISPLAY NAME : "+firstName+" "+lastName+
				" Company Email : "+email+
				" MailBox Capacity : "+mailboxCapacity+"mb";
	}

}
