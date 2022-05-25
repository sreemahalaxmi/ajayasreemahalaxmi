public class IllegalException extends Exception {
	void withdraw (double amount) throws IllegalException
	{
	    double balance = 0;
		if (amount > balance)
	        throw new IllegalException();
	    else
	        balance -= amount;
	}


}