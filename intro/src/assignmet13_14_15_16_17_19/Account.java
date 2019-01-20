package assignmet13_14_15_16_17_19;

abstract class Account {
int accNo;
double Balance;
Customer customer;

public Account(int no, Customer customer, double Balance)
{
	accNo=no;
	this.customer=customer;
	this.Balance=Balance;
}
public Customer getCustomer()
{
	return customer;
}
public double EnquiryBalance()
{
	return Balance;
}

public void deposit(double amount)
{
	Balance=Balance+amount;
}
public static void main(String args[]){

  
    Customer customer1 = new Customer(1, "John","1209 north");
    SavingAccount customerSA = new SavingAccount(1,customer1,1000.0);
    customerSA.deposit(1000.0);
    System.out.println("Saving of " +customer1.cusName + " Current Balance "+ customerSA.EnquiryBalance());
    Customer customer2 = new Customer(2,"bob","656 South");
    CurrentAccount customerCA = new CurrentAccount(2,customer2,9000d,8000d);
    System.out.println("Checking of " +customer2.cusName + "  Current Balance "+ customerCA.EnquiryBalance());
    customerCA.overDraft(1000.0);
    System.out.println("Checking of " +customer2.cusName + "  Current Balance "+ customerCA.EnquiryBalance());
    customerCA.overDraft(4000.0);
  
}
}
