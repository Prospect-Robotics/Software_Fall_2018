
public class Cautious implements StockInvestor{
	//Every new Investor should have a NumberOfStocks variable.
	int NumberOfStocks = 1;
	
	public Cautious() {
		//Make sure you add your Investor into [database] here.
		//Hint: To add it in use one of [database]'s methods.
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				//Two methods should be used here. I wonder what they are...
				
				
				//
				Thread.sleep(1000); 
				/* This line of code pauses a thread for exactly 1000 milliseconds, don't touch it, but memorize it for future use.*/
			}catch(Exception e) {
				
			}
		}
		
	}
	
	/**
	 * Use If, If Else, and Else statements to have the Investor change their number of stocks based on [database]'s [stockValue]
	 */
	@Override
	public void strategy() {
	}

	@Override
	public void sendInformation() {
	}
	
}
