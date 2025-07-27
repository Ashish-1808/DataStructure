/*
1.Uses divide and consquer stratergy.
2.Working-->
	1.Divide the unsorted list into n sublists,each containing 1 element.
	2.Take adjacent pairs of two singleton and merge them to form a list of 2 elements.n will now convert into n/2 lists of size 2.
	3.Repeat the process until the single sorted lists is obtained.*/
	
	
class MergeSort
{
	int[] array;					//this arra is for copying sorted array elements
	int[] tempMergeArr;				//this is for temporary merging
	int length;
	public static void main(String[] args)
	{
		int[] arr={48,36,13,52,19,94,21};
		MergeSort obj=new MergeSort();
		obj.sort(arr);
		
		//printing sorted array elements
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	
	public void sort(int inputArr[])
	{
		this.array=inputArr;		
		this.length=inputArr.length;
		this.tempMergeArr=new int[length];		//create temp array of length arr.length
		divideArray(0,length-1);
	}
	
	//this method divide the array
	public void divideArray(int lowerIndex,int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middle=(lowerIndex+higherIndex)/2;
			divideArray(lowerIndex,middle);					//it will sort left side of the array
			divideArray(middle+1,higherIndex);		//it will sort right side of the array
			
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}
	
	//this method combining the divided array
	public void mergeArray(int lowerIndex,int middle,int higherIndex)
	{
		for(int i=lowerIndex;i<=higherIndex;i++)
		{
			tempMergeArr[i]=array[i];				//copy all array elements in tempMergeArr array
		}
		
		//setting indexes for traversal
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		
		//combining array elements by sorting them in ascending order
		while(i<=middle && j<=higherIndex)
		{
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				array[k]=tempMergeArr[i];
				i++;
			}
			else
			{
				array[k]=tempMergeArr[j];
				j++;	
			}
			k++;
		}
		
		while(i<=middle)		//copy remaining elements
		{
			array[k]=tempMergeArr[i];
			k++;
			i++;
		}
		
		while(j<=higherIndex)		//copy remaining elements
		{
			array[k]=tempMergeArr[j];
			k++;
			j++;
		}
	}
}
