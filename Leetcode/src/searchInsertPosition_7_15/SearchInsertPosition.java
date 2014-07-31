package searchInsertPosition_7_15;
//like the 二分法 查找
public class SearchInsertPosition {

	public int searchInsertPosition(int A[],int target)
	{
		int low = 0;
		int high = A.length - 1;
		int mid ;
		
		while(low<=high)
		{
			mid = low + ((high-low)>>1);
			if(A[mid]==target)
				return mid;
			if(A[mid]<target)
				low = mid + 1;
			if(A[mid]>target)
				high = mid -1;
		}
		
		return low;
	}
}
