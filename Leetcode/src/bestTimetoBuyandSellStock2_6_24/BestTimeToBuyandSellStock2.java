package bestTimetoBuyandSellStock2_6_24;

public class BestTimeToBuyandSellStock2 {

	public int maxProfit(int[] prices)
	{
		int len = prices.length;
		int re = 0;
		if(len<2)
			return re;
		for(int i=1;i<len;i++)
		{
			if(prices[i]-prices[i-1]>0)
				re += prices[i]-prices[i-1];
		}
		return re;
	}
	
	public static void main(String []str)
	{
		int []test = {1,2,3,2,5};
		BestTimeToBuyandSellStock2 b = new BestTimeToBuyandSellStock2();
		System.out.println(b.maxProfit(test));
	}
}
