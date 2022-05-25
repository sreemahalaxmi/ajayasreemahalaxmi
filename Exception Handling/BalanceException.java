public class BalanceException extends Exception {
	void withdraw (double amount) throws BalanceException
	{
	    double balance = 0;
		if (amount > balance)
	        throw new BalanceException();
	    else
	        balance -= amount;
	}


}
