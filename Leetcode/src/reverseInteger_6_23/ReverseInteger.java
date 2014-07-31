package reverseInteger_6_23;

public class ReverseInteger {

	public int reverse(int x)
	{
		boolean negFlag = false;
		if(x<0)
		{
			negFlag = true;
			x *= -1;
		}
		
		int res = 0;
		while(x>0)
		{
			int yu = x % 10;
			x /= 10;
			res = res * 10 + yu;
		}
		if(negFlag) res *= -1;
		
		return res;
	}
	
	public static void main(String []str)
	{
		ReverseInteger r = new ReverseInteger();
		System.out.println(r.reverse(-123));
	}
}
