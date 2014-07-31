package generateParentheses_7_28;

import java.util.ArrayList;

public class GenerateParentheses {
	public ArrayList<String> fun(int n)
	{
		ArrayList<String> res = new ArrayList<String>();
		if(n<=0) return res;
		dsf(res,"",n,n);
		return res;
	}
	
	public void dsf(ArrayList<String> res,String temp,int left,int right)
	{
		if(left==0 && right==0)
		{
			res.add(temp);
			return;
		}
		if(left>0)  	dsf(res,temp+"(",left-1,right);
		if(left<right) 	dsf(res,temp+")",left,right-1);
	}
	
	public static void main(String []str)
	{
		GenerateParentheses g = new GenerateParentheses();
		
		ArrayList<String> res = g.fun(3);
		
		for(int i=0;i<res.size();i++)
		{
			System.out.println(res.get(i));
		}
	}
}
