/*
Write another class SpecialSavings that extends SavingsAccount to pay interest of 10% on accounts that 
have balances that exceed 10K. Also provided methods to deposit and take money out of savings account.
Write a driver program to test the class SpecialSavings. Instantiate two different savingsAccount 
objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Make a few deposits 
and withdrawals and show balance and interest earned for each account. 

 */
//SpecialSavings is the child class of SavingsAccount
//inheritance
public class SpecialSavings extends SavingsAccount{

	//polymorphism:
	protected void calculateMonthlyInterest()
	{
		//double interestRate = getAnnualInterestRate();
		double interestRate = 0.0d; 
		
		if (getSavingsBalance() > 10000) {
			interestRate = 0.10;
		}
		else if(getSavingsBalance() < 10000)
		{
			interestRate = 0.04;
		}
		
		 double savingBalance = getSavingsBalance() + getSavingsBalance()*interestRate/12;
		 setSavingsBalance(savingBalance);
	}
}
