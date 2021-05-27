package instagram;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import instagram1.instagramcontroller;

public class instagramview {

	public static void main(String[] args)throws Exception {
		
		String ss="yes";
		
		while(ss.equals("yes")){
		
		System.out.println("===========MainMenu==========");
		System.out.println("0) Open Insta MainMenu");
		System.out.println("1) for Create Insta Profile");
		System.out.println("2) for View Insta Profile");
		System.out.println("3) for Delete Insta Profile");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your num");
		String b=br.readLine();
		int d=Integer.parseInt(b);
		
		instagramcontroller ic=new instagramcontroller();
		
		switch(d) {
		
		case 0:
			ic.openMainMenu();
			break;
		case 1:
			ic.createInstaProfile();
			break;
		case 2:
			ic.viewInstaProfile();
			break;
		case 3:
			ic.deleteInstaProfile();
			break;
		default :System.out.println("wrong choice");
		}
		
		
		
		System.out.println("To continue press yes");
		System.out.println("To continue press no");
		ss=br.readLine();
		
	}
		
		System.out.println("execution completed");
}
}
