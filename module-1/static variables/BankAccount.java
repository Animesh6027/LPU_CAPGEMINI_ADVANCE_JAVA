/*
Q. Write a Java class named BankAccount that meets the following requirements:

1. Static Variable : 

interestRate (a static variable) representing the common interest rate for all accounts. Initialize it to 5.0%.

2. Non-Static Variable : 

balance (a non-static variable) representing the account balance. Each account starts with $1000.

3. Static Method : 

updateInterestRate(double newRate): A static method to update the interestRate for all accounts.

4. Non-Static Methods

- deposit(double amount): Adds money to the account balance.

- withdraw(double amount): Deducts money from the account if sufficient funds exist. Otherwise, display "Insufficient funds!".

- displayAccountInfo(): Displays the account's balance and the current interest rate.



5. Main Method :

- Create two bank accounts (acc1, acc2).

- Update the interest rate using the static method.

- Perform deposit and withdrawal operations on both accounts.

- Display the account details after transactions.

*/

public class BankAccount{
	static double interest = 5.0;

	double balance = 1000;

	static void updateInterestRate(double newRate){
		interest = newRate;
	} 

	void deposit(double amount){
		balance+=amount;
	}

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

   void displayAccountInfo() {
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interest + "%");
    }

    public static void main(String[] args) {
    	BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        BankAccount.updateInterestRate(6.5);

        acc1.deposit(500);
        acc1.withdraw(300);

        acc2.deposit(1000);
        acc2.withdraw(2500);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

    }

}