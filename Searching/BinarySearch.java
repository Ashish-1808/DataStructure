/*For Binary Search array must be sorted.*/
class BinarySearch
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40,50,60,70,80,90};
		int item=70;
		
		BinarySearch obj=new BinarySearch();
		int flag=obj.binarySearch(arr,0,arr.length-1,item);
		
		if(flag==-1)
		{
			System.out.println("Element not preseeeent in the list..");
		}
		else
		{
			System.out.println("Element present at "+flag+" index");
		}
	}
	
	  // Recursive method for Binary Search
	int binarySearch(int[] arr,int low,int high,int target)
	{
		if(low>high)
		{
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]==target)							//check middle element is target element or not
		{
			return mid;		
		}
		else if(arr[mid]>target)
		{
			return binarySearch(arr,low,mid-1,target);		// Search left half
		}
		else
		{
			return binarySearch(arr,mid+1,high,target);		// Search right half
		}
	}
}
