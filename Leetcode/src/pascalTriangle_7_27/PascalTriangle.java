package pascalTriangle_7_27;

import java.util.ArrayList;

public class PascalTriangle {

	ArrayList<ArrayList<Integer>> generate(int numRow)
	{
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<numRow;i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(1);
			if(i>0)
			{
				for(int j=0;j<res.get(i-1).size()-1;j++)
				{
					temp.add(res.get(i-1).get(j) + res.get(i-1).get(j+1));
				}
				temp.add(1);
			}
			res.add(temp);
		}
		
		return res;
	}
}
