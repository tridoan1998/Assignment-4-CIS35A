/*
 Create a class SavingsAccount. Use a static class variable to store the annualInterestRate for each of the savers.
 Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently 
 has on deposit. Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the balance by 
 annualInterestRate divided by 12; this interest should be added to savingsBalance. Provide a static method modifyInterestRate 
 that sets the annualInterestRate to a new value. Write a driver program to test the class SavingsAccount. Instantiate two 
 different savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. 
 Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances for each of the savers.
  Then set the annualInterestRate to 5% and calculate the next months interest and print the new balances for each of the savers.
 */

//review protected and static 

public class SavingsAccount {
	// static variable
	private static double annualInterestRate;	//store annual interest rate for each of the savers.
	//private instance variable
	private double savingsBalance;		//amount the saver currently has on deposit.
	
	//constructor 
	SavingsAccount()
	{
		
	}
	//setter and getter
	protected static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	protected static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	protected double getSavingsBalance() {
		return savingsBalance;
	}
	protected void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}	
	
	
//	calculate the monthly interest by multiplying the balance by 
//	 annualInterestRate divided by 12; this interest should be added to savingsBalance
	protected void calculateMonthlyInterest()
	{
		savingsBalance += savingsBalance*annualInterestRate/12;
	}
	
//	Provide a static method modifyInterestRate 
//	that sets the annualInterestRate to a new value
	//protected methods to set and get the value of private variables. 
	protected static void modifyInterestRate(double newInterestRate)
	{
		annualInterestRate = newInterestRate;
	}
	
	protected void deposit(double amount)
	{
		savingsBalance += amount;
	}
	
	protected void withdrawal(double amount)
	{
		if(amount > savingsBalance)
		{
			System.out.println("Balance below zero, withdrawal can't be done!");
		}
		else 
		{
			savingsBalance -= amount;
		}
	}
}
