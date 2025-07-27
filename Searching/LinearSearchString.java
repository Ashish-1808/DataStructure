/*Linear search also called as Sequential Search.*/
class LinearSearchString
{
	public static void main(String[] args)
	{
		String[] arr={"Deepak","Rohit","Rahul","Deepesh","Vironika","Amit"};
		String item="Deepesh";
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(item))
			{
				System.out.println("Element is present at "+i+" index position");
				temp+=1;
			}
		}
		
		if(temp==0)
		{
			System.out.println("Item not found in the list...");
		}
		
	}
}