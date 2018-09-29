/**
 * This is an interface for what? Notice that it extends Runnable.
 */
public interface StockInvestor extends Runnable {
	//This is a Singleton for DNT_Messenger. Use "database.______" to get its methods and variables.
	//You can hover over database to check what methods and variables there are.
	DNT_Messenger database = DNT_Messenger.getInstance();
	
	/**
	 * Create three classes based on this Interface to represent different stock investing strategies.
	 * 
	 * This one is already partially made for you:
	 * 
	 * Cautious: 
	 *  - NEEDS A STRATEGY: Raise the number of stocks until the Stock Price = 3,
	 * at which the number of stocks should stop changing.
	 * 
	 * Create two more with their own unique strategies!
	 */
	public void strategy();
	
	/**
	 * This method should be programmed to send information to [database], which [database] method makes sense to use?.
	 */
	public void sendInformation();
	
}