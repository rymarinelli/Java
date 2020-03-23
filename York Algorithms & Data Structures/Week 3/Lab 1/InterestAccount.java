
public class InterestAccount extends Account {
	
	double monthlyInterestRate;
	
 
	public InterestAccount(double balence, double monthlyInterestRate)
	{
		super(balence);
		this.monthlyInterestRate = monthlyInterestRate;
		
	}
	
	public void setMonthlyInterestRate(double monthlyInterestRate)
	{
		monthlyInterestRate = this.monthlyInterestRate;
	}
	
	public double getMonthlyInterestRate()
	{
		return monthlyInterestRate;
	}
	
	public double addMonthlyInterest()
	{
		return (super.getBalance() * monthlyInterestRate) + super.getBalance();
	}
	
	
	public String toString()
	{
		return "The monthly interest is\t"  + monthlyInterestRate;
	}
	
	
 
}
