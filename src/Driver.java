
/*
 * Part 1
Create a class SavingsAccount. Use a static class variable to store the annualInterestRate for each of the savers.
 Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently 
 has on deposit. Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the balance by 
 annualInterestRate divided by 12; this interest should be added to savingsBalance. Provide a static method modifyInterestRate 
 that sets the annualInterestRate to a new value. Write a driver program to test the class SavingsAccount. Instantiate two 
 different savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. 
 Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances for each of the savers.
  Then set the annualInterestRate to 5% and calculate the next months interest and print the new balances for each of the savers. 
 
Part 2
Write another class SpecialSavings that extends SavingsAccount to pay interest of 10% on accounts that have 
balances that exceed 10K. Also provided methods to deposit and take money out of savings account. Write a driver 
program to test the class SpecialSavings. Instantiate two different savingsAccount objects, saver1 and saver2, with 
balances of $2000.00 and $3000.00, respectively. Make a few deposits and withdrawals and show balance and interest earned 
for each account. 

Some Tips for helping you with Lab 4:
For Lab 4 part 1 - 
Pl. follow the instructions in the assignment and write the class definition. A driver program is the code you
 would write in main() to exercise the code of class definition. 
 
You should declare private variable in your class definition. You should also write protected methods to set and 
get the value of private variables. 
 
For Exercise 1 part 2 - 
You need to write deposit and withdrawal methods. Should you put this in parent class or child class? Try to 
answer this question so that you have most reusability in your class definition. 
 
In this part - you have to learn how polymorphism works. 
You will have accounts whose balance might be above or below 10K. By using methods in both classes try to change 
the interest earned to 10% if balance is above 10K or 4% if the interest is lower.
 * 
 */

//test the class SavingsAccount
public class Driver {

	public static void main(String[] args) {

		System.out.println("\t\tTesting SavingsAccount class");
		System.out.println("\t\t----------------------------\n");
		
		/*
		 *  Instantiate two different savingsAccount objects, saver1 and saver2, with balances of $2000.00 
		 *  and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the monthly interest 
		 *  and print the new balances for each of the savers. Then set the annualInterestRate to 5% and 
		 *  calculate the next months interest and print the new balances for each of the savers. 
		 */
		
		//created two new SaingsAccount objects 
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
				
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		
		System.out.printf("Saving Balance for saver 1: %.2f\n", saver1.getSavingsBalance());
		System.out.printf("Saving Balance for saver 2: %.2f\n\n", saver2.getSavingsBalance());

		//static variable needed to access in a static way
		SavingsAccount.setAnnualInterestRate(0.04);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.printf("Interset rate is: %.2f \n", SavingsAccount.getAnnualInterestRate());
		System.out.printf("New Saving Balance for saver 1: %.2f\n", saver1.getSavingsBalance());
		System.out.printf("New Saving Balance for saver 2: %.2f\n\n", saver2.getSavingsBalance());

		//set static to a new number
		SavingsAccount.modifyInterestRate(0.05);
		
		//calculate new monthly interest with new update static interest rate
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.printf("Interset rate is: %.2f \n", SavingsAccount.getAnnualInterestRate());
		System.out.printf("New saving balance for saver 1: %.2f\n", saver1.getSavingsBalance());
		System.out.printf("New saving balance for saver 2: %.2f\n\n", saver2.getSavingsBalance());
		
		
		
		/*
		 * Write a driver program to test the class SpecialSavings. Instantiate two different
		 * savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, 
		 * respectively. Make a few deposits and withdrawals and show balance and interest earned
		 * for each account. 
		 */
		System.out.println("\t\tTesting SpecialSavings class");
		System.out.println("\t\t----------------------------\n");
		//created two child class of SavingAccount 
		SavingsAccount saver3 = new SpecialSavings();
		SavingsAccount saver4 = new SpecialSavings();
		
		
		saver3.setSavingsBalance(2000.00);
		saver4.setSavingsBalance(3000.00);
		
		System.out.printf("Saving Balance for saver3: %.2f \n", saver3.getSavingsBalance());
		System.out.printf("Saving Balance for saver4: %.2f \n\n", saver4.getSavingsBalance());

		
		System.out.println("saver3 starting to deposit and withdraw!\n");
		saver3.deposit(16000);
		saver3.withdrawal(1000);
		saver3.deposit(20000);
		saver3.withdrawal(15000);
		System.out.printf("Saving Balance for saver3 after deposit and withdrawal: %.2f \n", saver3.getSavingsBalance());
		saver3.calculateMonthlyInterest();
		System.out.printf("New Saving Balance for saver3 after monthly interest: %.2f \n", saver3.getSavingsBalance());
		
		
		System.out.println("\nsaver4 starting to deposit and withdraw!\n");
		saver4.deposit(1000);
		saver4.withdrawal(2000);
		saver4.deposit(3000);
		saver4.withdrawal(1000);
		System.out.printf("Saving Balance for saver4 after deposit and withdrawal: %.2f \n", saver4.getSavingsBalance());
		saver4.calculateMonthlyInterest();
		System.out.printf("New Saving Balance for saver4 after monthly interest: %.2f \n", saver4.getSavingsBalance());

	}

}
