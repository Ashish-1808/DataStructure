/*
2*i+1-->Child Index(Left)
2*i+2-->Child Index(Right)

(i-1)/2--> Parent Index 
*/
class HeapSort
{
	public static void main(String[] args)
	{
		int[] arr={22,13,17,11,10,14,12};
		HeapSort hs=new HeapSort();
		hs.sort(arr);
		hs.printArray(arr);
	}
	
	void sort(int[] arr)
	{
		int leng=arr.length;
		//calculate parent node position and pass values for heapify the tree
		for(int i=leng/2-1;i>0;i--)
		{
			heapify(arr,leng,i);
		}
		
		//swap the elements and heapitfy again
		for(int i=leng-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	
	//method for heapify the tree structure
	void heapify(int[] arr,int n,int i)
	{
		int largest=i;
		int li=2*i+1;		//calculate index position of left child node
		int ri=2*i+2;		//calculate index position of right child node
		
		if(li<n && arr[li]>arr[largest])
		{
			largest=li;
		}
		if(ri<n && arr[ri]>arr[largest])
		{
			largest=ri;
		}
		
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,n,largest);
		}
	}
	
	void printArray(int[] arr)
	{
		System.out.print("Sorted Array: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}