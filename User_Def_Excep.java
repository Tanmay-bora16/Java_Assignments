package assignments;
import java.util.Scanner;

class Invalid_City_Vehicle extends Exception{
	
	public Invalid_City_Vehicle(String str){
		super(str);
		
	}	
}

public class User_Def_Excep {
	static void validate(String city, int TOV) throws Invalid_City_Vehicle {

		System.out.println();
		System.out.println();
		
		if (city.equals("pune") || city.equals("chennai") || city.equals("bangalore") || city.equals("mumbai")) {
			
			if(TOV == 4) {
				
				System.out.println("Successfull :) xD");
				
			}
			else {
				
				System.out.println("Invalid Vehicle!!!!");
				throw new Invalid_City_Vehicle("Invalid City or Type Of Vehicle");
				
			}
		}
		
		else {
			System.out.println("Invalid City. Please Check the Spellings!!!!");
			throw new Invalid_City_Vehicle("Invalid City or Type Of Vehicle");
			
		}	
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your City : ");
		String city = sc.next();
		
		System.out.print("Enter Your Type of Vehicle (e.g. 2 for 2 Wheeler and 4 for 4 Wheeler and so on) : ");
		int TOV = sc.nextInt();
		
		city.toLowerCase();
		
		try {
			validate(city,TOV);
			
		}
		catch(Invalid_City_Vehicle e) {
			
			System.out.println("Caught : "+e);
			
		}
		System.out.println("End Of the Code");
	}

}
