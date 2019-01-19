package assignmet13_14_15_16_17;

public class SavingAccount extends Account {
double miniBal;
double interest;
public SavingAccount(int accNo, Customer customer, double Balance)
{
	super(accNo,customer,Balance);
	miniBal=500d;
	interest=12;
}
public void withdraw(double amount){
	super.Balance = super.Balance-amount;
	System.out.println("withdrawal Sucessfully:");
}
public void calculateInterest(){
    double interestAmount = super.Balance *(interest/100.0);
    System.out.println("The interest for your balance "+ super.Balance +"is "+ interestAmount);
}
}
