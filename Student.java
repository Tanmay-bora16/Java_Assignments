package assignments;
import java.util.Scanner;
public class Student {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		String Name;
		int Roll_No, M1, M2, M3;
		
		System.out.print("Enter Your Name : ");
		Name = sc.nextLine();
	
		System.out.print("Enter Your Roll Number : ");
		Roll_No = sc.nextInt();
		
		System.out.print("Enter Your Marks in Subject 1 : ");
		M1 = sc.nextInt();
		
		System.out.print("Enter Your Marks in Subject 2 : ");
		M2 = sc.nextInt();
		
		System.out.print("Enter Your Marks in Subject 3 : ");
		M3 = sc.nextInt();
		
		int Avg;
		int Sum = M1 + M2 + M3;
		Avg = (M1 + M2 + M3)/3;
		
		if(Avg >= 80) {
			System.out.println("Your Grade is 'A'");
		}
		
		else if(Avg < 80 && Avg >= 60) {
			System.out.println("Your Grade is 'B'");		
		}
		
		else if(Avg < 60 && Avg >= 40) {
				System.out.println("Your Grade is 'C'");
		}
		else if(Avg < 40) {
			System.out.println("Your Grade is 'D'");
		}
		else {
			System.out.println("Fail!!!!!!!");
		}
		
		System.out.println();
		System.out.println("Average : "+Avg);
	}	
}