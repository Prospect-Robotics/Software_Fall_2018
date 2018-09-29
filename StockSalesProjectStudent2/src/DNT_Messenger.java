import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DNT_Messenger {
	/*
	 _____   ____    _   _  ____ _______   _______ ____  _    _  _____ _    _ 
	|  __ \ / __ \  | \ | |/ __ \__   __| |__   __/ __ \| |  | |/ ____| |  | |
	| |  | | |  | | |  \| | |  | | | |       | | | |  | | |  | | |    | |__| |
	| |  | | |  | | | . ` | |  | | | |       | | | |  | | |  | | |    |  __  |
	| |__| | |__| | | |\  | |__| | | |       | | | |__| | |__| | |____| |  | |
	|_____/ \____/  |_| \_|\____/  |_|       |_|  \____/ \____/ \_____|_|  |_|
                                                                   
	*/
	
	public Map<String, PointList> points = new HashMap();
	
	public int StockPrice = 5;
	
	private static DNT_Messenger instance = null;
	
	class PointList{
		ArrayList<Integer> listingPoints = new ArrayList();
		PointList(){
			
		}
		public ArrayList<Integer> get() {
			return listingPoints;
		}
		public void add(int num) {
			listingPoints.add(num);
		}
	}
	/**
	 * Sends a data point to the graph!
	 * @param name Put here whatever you put for AddList.
	 * @param num The number you want to send. Remember, we want to graph the number of stocks each person has.
	 */
	public void AddDataPoint(String name, int num) {
		if(points.containsKey(name)) {
			points.get(name).add(num);
		}
		
	}
	/**
	 * Puts your Stock investor's name into the database. This is REQUIRED.
	 * @param name What your strategy's name is. Make it the class's name for simplicity.
	 */
	public void AddList(String name) {
		points.put(name, new PointList());
	}
	/**
	 * Grabs the stock price from the database.
	 * @return It is an Int.
	 */
	public int getStockPrice() {
		return StockPrice;
	}
	
	public synchronized static DNT_Messenger getInstance(){
		if(instance==null){
		   instance = new DNT_Messenger();
		}
	   return instance;
	}
}