package emailapp;

import java.security.SecureRandom;
import java.util.Scanner;


public class Email 
{
	private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";
    
    private String firstName, lastName;
    private String department;
    private String password;
    private String randomPassString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    private String emailAdd;
    private String atEmailAdd;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) 
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	System.out.println("New Worker: "+this.firstName+" "+this.lastName + ". Department Codes:");
    	this.department = SetDepartment(); // returning the department
    	//System.out.println("DEPARTMENT: "+this.department);
    	
    	this.emailAdd = this.firstName.toLowerCase() +"."+ this.lastName.toLowerCase()+"@"+this.department.toLowerCase()+"."+this.companySuffix;    		
    	
    	    	
    	//System.out.println("COMPANY MAIL: "+this.emailAdd);
    	
    	this.password = randomPassword(this.defaultPasswordLength);
    	//System.out.println("PASSWORD: "+this.password);
    	
    } 

    // Ask for the department
    private String SetDepartment()
    {
    	System.out.println("1 For Sale\n"+"2 For Development\n"+"3 For Accounting\n"+"0 For None\n" + "Enter department code ");
    	Scanner scan = new Scanner(System.in);				// read object
    	int selectDep = scan.nextInt();
    		if(selectDep == 1)
    			return "Sales";
    		else if(selectDep == 2)
    			return "dev";
    		else if(selectDep == 3)
    			return "Accounting";
    		else return " ";
    }
    
     // Generate a random password
    private String randomPassword(int length) 
    {
    	SecureRandom sr = new SecureRandom();
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=0; i<length; i++)
    	{
    		int rIndex = sr.nextInt(randomPassString.length());
    		sb.append(randomPassString.charAt(rIndex));
    	}
    	
    	return sb.toString();
    }
    
    // Set methods to Change Password, Alternate email, and mail capacity
    public void setChangePassword(String password)
    {
    	this.password = password;
    }
    public void setAlternateEmail(String atEmailAdd)
    {
    	this.atEmailAdd = atEmailAdd;
    }
    public void setMailCapacity(int mailCapacity)
    {
    	this.mailboxCapacity = mailCapacity;
    }
    
    //get methods for Name, Email, mail capacity, alternate email and change password
    public String getName(String fName, String lName)
    {
    	String name = fName+" "+lName;
    	return name;
    }
    public String getEmail(String email)
    {
    	return this.emailAdd;
    }
    public int getMailCapacity(int mCap)
    {
    	return this.mailboxCapacity;
    }
    public String getChangePassword(String password)
    {
    	return password;
    }
    public String getAlternateEmail(String atEmailAdd)
    {
    	return atEmailAdd;
    }
    
    //method to display full information
    public String showInfo()
    {
    	return "DISPLAY NAME:"+firstName+" "+lastName+ "\nDEPARTMENT: "+department+"\nCOMPANY EMAIL: "+emailAdd+"\nPASSWORD: "+this.password+"\nMAILBOX CAPACITY: "+mailboxCapacity+"mb";
    }
}
