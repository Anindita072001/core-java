package inheritanceandPolymorphism;
abstract class BankAccount{

int account_number;

int balance;

abstract void deposit();

abstract void withdraw();

}



class CheckingAccount extends BankAccount{

void deposit() {

System.out.println("Rs. 1000 deposit");

}

void withdraw() {

System.out.println("Rs. 500 withdraw");

}

}
public class Third {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		CheckingAccount c = new CheckingAccount();

		c.deposit();

		c.withdraw();

		}



		
}
