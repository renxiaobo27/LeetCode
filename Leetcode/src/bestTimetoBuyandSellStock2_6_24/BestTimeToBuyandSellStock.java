package bestTimetoBuyandSellStock2_6_24;

public class BestTimeToBuyandSellStock {

	int maxProfit(int []prices)
	{
		int len = prices.length;
		int re = 0;
		if(len<2)
			return re;
		int min = prices[0];
		for(int i=1;i<len;i++)
		{
			if(prices[i]>prices[i-1])
			{
				if(prices[i]-min>re)
					re = prices[i]-min;
			}
			else
			{
				if(prices[i]<prices[i-1])
				{
					if(prices[i]<min)
						min = prices[i];
				}
			}
		}
		
		return re;
	}
	
	public static void main(String []str){
		int [] test = {4,1,2};
		BestTimeToBuyandSellStock b = new BestTimeToBuyandSellStock();
		System.out.println("BestTimeToBuyandSellStock\t"+b.maxProfit(test));
	}
}
