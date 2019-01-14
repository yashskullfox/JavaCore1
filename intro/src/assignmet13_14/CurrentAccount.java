package assignmet13_14;

public class CurrentAccount extends Account {
double eligibilityAmount;
public CurrentAccount(int accNo, Customer customer, double Balance,double eligibilityAmount)
{
	super(accNo,customer,Balance);
	this.eligibilityAmount=eligibilityAmount;
}

public void overDraft(double Amount)
{
	if(super.Balance > this.eligibilityAmount)
	{
		super.Balance = super.Balance-Amount;
	}
	else 
	{
		System.out.println("You can not witdraw/OverDraft");
	}
	
	
}
public double getEligibilityAmount() {
	return eligibilityAmount;
}

}
