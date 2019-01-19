package assignment8abc;

public class Loan {
	 private int loanNo;
	 private int accountNo;
	 private int customerNo;
	 private float loanAmount;
	 private int loanDuration;
	 private float interest;
	// static int loanCounter;
	private static int loanCounter = 0;
//	 Loan()
//	 {
//		 loanCounter++;
//	 }
	 public static Loan getInstance() {
		 Loan loan1= new Loan(1,23,1,2345f,12);
	     //   Loan loan2= new Loan(2,24,2,5646f,10);
	        return loan1;
	    }

	    public static int getLoanCounter() {
	        return loanCounter;
	    }
	    
Loan(int accountNo , int customerNo,int loanDuration ,float loanAmount, float interest){
		// this();
		 setAccountNo(accountNo);
		 setCustomerNo(customerNo);
		 setLoanAmount(loanAmount);
		 setInterest(interest);
	 }
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
// public static void main(String args[]){
//	        Loan loan1= new Loan(1,23,1,2345f,12);
//	        Loan loan2= new Loan(2,24,2,5646f,10);
//	        Loan loan3= new Loan(2,24,2,5646f,10);
//	System.out.println("Number of Loans :"+loanCounter);
// }
	 
}
