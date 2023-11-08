package assignments;
import java.util.Scanner;

class Engg{
	
	Scanner sc = new Scanner(System.in);
	
	String Dept;
	String Div;
	int Batch_Number;
	
	Engg(){
		System.out.print("Enter Your Dept : ");
		Dept = sc.nextLine();
		
		System.out.print("Enter Your Divison (From A, B, C, D) : ");
		Dept = sc.nextLine();
		
		System.out.print("Enter Your Batch Number (For B1 = 1,....) : ");
		Batch_Number = sc.nextInt();
	}
	
	String getDept() {
		return Dept;
	}
	
	String getDiv() {
		return Div;
	}
	
	int getBatch_Number() {
		return Batch_Number;
	}
}

class Comp_Engg extends Engg{
	
	Scanner sc = new Scanner(System.in);
	
	String Name;
	String Hobbies;
	int GR_Number;
	int Roll_Number;
	
	Comp_Engg(){
		
		System.out.print("Enter Your Name : ");
		Name = sc.nextLine();
		
		System.out.print("Enter Your Hobbies : ");
		Hobbies = sc.nextLine();
		
		System.out.print("Enter Your Roll Number : ");
		Roll_Number = sc.nextInt();
		
		System.out.print("Enter Your GR Number : ");
		GR_Number = sc.nextInt();
		
	}	
	
	String getName() {
		return Name;
	}
	
	String getHobbies() {
		return Hobbies;
	}
	
	int getRoll() {
		return Roll_Number;
	}
	
	int getGR() {
		return GR_Number;
	}
}


public class Engg_Student extends Comp_Engg {
	
	Scanner sc = new Scanner(System.in);
	
	String AI;
	int marks;
	
	public  Engg_Student() {
		System.out.print("Enter Your Areas Of Interests : ");
		AI = sc.nextLine();
		
		System.out.print("Enter Your Marks (out of 100) : ");
		marks = sc.nextInt();
	}
	
	String getAI() {
		return AI;
	}
	
	int getMarks(){
		return marks;
	}
	
	
	public void display() {
		
		System.out.println();
		System.out.println();
		System.out.println("********//RESULTS//********");
		
		System.out.println("|	DEPARTMENT : "+getDept());
		System.out.println("|	DIVISION : "+getDiv());
		System.out.println("|	BATCH NUMBER : "+getBatch_Number());
		
		System.out.println("|	NAME : "+getName());
		System.out.println("|	ROLL NUMBER : "+getRoll());
		System.out.println("|	GR NUMBER : "+getGR());
		System.out.println("|	HOBBIES : "+getHobbies());
		
		System.out.println();
		System.out.println("|	AREAS OF INTEREST : "+getAI());
		System.out.println("|	MARKS : "+getMarks());
		
		
		
	}
	
	public static void main(String args[]) {
		
		Engg_Student s = new Engg_Student();
		s.display();
		
	}
	
}
