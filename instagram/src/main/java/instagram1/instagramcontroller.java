package instagram1;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import static instagram1.instagramcontroller.*;

public class instagramcontroller { 
	
	private static String name;
	private static String id;
	private static String password;
	
	public static void openMainMenu() {
		
		System.out.println("press 1 for Create Insta Profile");
		System.out.println("press 2 for View Insta Profile");
		System.out.println("press 3 for Delete Insta Profile");
		System.out.println("  ");
		System.out.println("  ");
		
	}
	
	public static void createInstaProfile()throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
	    System.out.println("Enter your name");
	    name=br.readLine();
	    
	    System.out.println("Enter your insta id");
	    id=br.readLine();
	    
	    System.out.println("Enter your password");
	   password=br.readLine();
	   
	   
	   System.out.println("details of the account are");
	   System.out.println(" ");
	   
	   System.out.println(name);
	   System.out.println(" ");
	   System.out.println(id);
	   System.out.println(" ");
	   System.out.println(password);
	   System.out.println(" ");
		
	   System.out.println("Your account is created succesfully !");
		
		
	}
	
	public static void viewInstaProfile()throws Exception{
		
		   System.out.println(name);
		   System.out.println(" ");
		   System.out.println(id);
		   System.out.println(" ");
		   System.out.println(password);
		   System.out.println(" ");
		   
		   System.out.println("Your account is viewed succesfully !");
		
	}
	
	public static void deleteInstaProfile()throws Exception{
		
		   name =" ";
		   id =" ";
		   password =" ";
		   
				
				   System.out.println(name);
				   System.out.println(" ");
				   System.out.println(id);
				   System.out.println(" ");
				   System.out.println(password);
				   System.out.println(" ");
				
				   System.out.println("Your account is deleted succesfully !");
	
	

}
}

