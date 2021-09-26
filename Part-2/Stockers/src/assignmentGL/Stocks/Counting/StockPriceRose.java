package assignmentGL.Stocks.Counting;

public class StockPriceRose {
	
	public StockPriceRose() {
		
	}

	public static void priceRose(boolean[] arrayOfBool)
	{
	    int count = 0;
	    for (Boolean b : arrayOfBool)
	    	if (b) 
	    		count++;
	    System.out.println("Total no of companies whose stock price rose today : " + count + " \n");
	}
}
