package assignments;
class HDFC{

	double ROI = 7.3;
	double getrateofinterest(){
		
//		double Interest_Rate = (ROI*amount)/100;
//		return Interest_Rate;
		return ROI;
		
	}
}

class SBI{
	
	double ROI = 8.4;
	double getrateofinterest(){
		
//		double Interest_Rate = (ROI*amount)/100;
//		return Interest_Rate;
		return ROI;
	
	}
}

class ICICI{
	
	double ROI = 9.7;
	double getrateofinterest(){
		
//		double Interest_Rate = (ROI*amount)/100;
//		return Interest_Rate;
	return ROI;
	
	}
}

public class Bank_Loan {
	
	public static void main(String args[]) {
	
		SBI Rahul = new SBI();
		HDFC Rohit = new HDFC();
		ICICI Rohan = new ICICI();
		
		
		int Amount = 500000;
		
		double Interest_Rate_SBI = (Rahul.getrateofinterest()*Amount)/100 ;
		double Interest_Rate_HDFC = (Rohit.getrateofinterest()*Amount)/100;
		double Interest_Rate_ICICI = (Rohan.getrateofinterest()*Amount)/100;
		
		System.out.println("Rate of interest on 5 Lakhs For Rahul in SBI Bank: "+Interest_Rate_SBI);
		System.out.println("Rate of interest on 5 Lakhs For Rohit in HDFC Bank: "+Interest_Rate_HDFC);
		System.out.println("Rate of interest on 5 Lakhs For Rohan in ICICI Bank: "+Interest_Rate_ICICI);
		
	}
}

