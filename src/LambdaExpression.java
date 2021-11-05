import java.util.Scanner;
import java.util.regex.Pattern;

interface CheckPerson {
    boolean ValidateFirstName(String p);
 }
interface CheckLastName {
	boolean ValidateLastName(String l);
}
interface CheckEmailId {
	 boolean ValidateEmailId(String e);
}
interface CheckMobile {
	 boolean ValidateMobile(String m);
}
interface CheckPassword {
	 boolean ValidatePassword(String p);
}
public class LambdaExpression {    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("\n Enter Your First Name : ");
        String firstName = scanner.next();
    	String regex = "^[A-Z]{1}[a-z]{2,}$";
    	CheckPerson lambdaValidateFirstName;
    	
    	lambdaValidateFirstName=(input)-> {
    		return Pattern.compile(regex).matcher(input).matches();        
    	};
		if (lambdaValidateFirstName.ValidateFirstName(firstName) == false) 
		{
            System.out.println("Your FirstName Entry is Invalid\n" +
                    "First name should start with Capital Letter and \n" +
                    "has atleast minimum 3 characters");
		}
        else {
            System.out.println("Your First Name Entry is Valid");
        }
		
		System.out.println("\n Enter Your Last Name : ");
        String lastName = scanner.next();
    	String regex1 = "^[A-Z]{1}[a-z]{2,}$";
    	CheckLastName lambdaValidateLastName ;
    	lambdaValidateLastName=(input)-> {
    		return Pattern.compile(regex1).matcher(input).matches();        
    	};
		if (lambdaValidateLastName.ValidateLastName(lastName) == false) 
		{
            System.out.println("Your Last Name Entry is Invalid\n" +
                    "First name should start with Capital Letter and \n" +
                    "has atleast minimum 3 characters");
		}
        else {
            System.out.println("Your Last Name Entry is Valid");
        }
    	
		System.out.println("\n Enter Your E-mail Id : ");
		String emailId = scanner.next();
    	String regex2 = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
    	CheckEmailId lambdaValidateEmailId ;
    	lambdaValidateEmailId=(input)-> {
    		return Pattern.compile(regex2).matcher(input).matches();        
    	};
		if (lambdaValidateEmailId.ValidateEmailId(emailId) == false) 
		{
            System.out.println("Your Email Id Entry is Invalid");
		}
        else {
            System.out.println("Your Email Id Entry is Valid");
        }
    	
		 System.out.println("\n Enter your Mobile Number");
		 String mobileNumber = scanner.next();
    	String regex3 = "^(\\d{1,3}[- ]?){1}\\d{9,10}$";
    	CheckMobile lambdaValidateMobile ;
    	lambdaValidateMobile=(input)-> {
    		return Pattern.compile(regex3).matcher(input).matches();        
    	};
		if (lambdaValidateMobile.ValidateMobile(mobileNumber) == false) 
		{
            System.out.println("Your Mobile Number Entry is Invalid\\n\" +\r\n"
            		+ "	                        \"Mobile Number Should Contain Country Code");
		}
        else {
            System.out.println("Your Mobile Number Entry is Valid");
        }
		
			System.out.println("\n Enter your Password");
			String password = scanner.next();
			String regex4 = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";
			CheckPassword lambdaValidatePassword ;
	   	lambdaValidatePassword=(input)-> {
	   		return Pattern.compile(regex4).matcher(input).matches();        
	   	};
			if (lambdaValidatePassword.ValidatePassword(password) == false) 
			{
	           System.out.println("\n Your Password is Invalid\\n\" +\r\n"
	           		+ "	                        \"Password Must Contain at least\\n\" +\r\n"
	           		+ "	                        \"one Uppercase, one Numeric, one Special Character\\n\" +\r\n"
	           		+ "	                        \"and minimum 8 Characters \"");
			}
	       else {
	           System.out.println("Your Password is Valid");
	       }

	}   
}