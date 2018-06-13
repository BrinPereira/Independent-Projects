
public class maxHeap
{

	int a[];
	int index=-1;
	
	maxHeap(int n)
	{
		a = new int[n];
	}
	
	void add(int v) throws Exception
	{
		if(index==a.length-1)
			throw new Exception("Heap is full");
		else
		{
			int i = ++index;
			for(;i>0&&a[(i-1)/2]<v; i=(i-1)/2)
			{
				a[i]=a[(i-1)/2];
			}
			 a[i]=v;
		}
	}
	
	int getMax() throws Exception
	{
	 if(index==-1)
		 throw new Exception("Heap is empty");
	 else
	 {
		int v = a[0];
		int t = a[index--];
		int i;
		
		for(i=1;i<=index;i=(2*i+1))
		{
			if((i+1)<=index && a[i]<a[i+1])
				i++;
			
			if(a[i]>t)
				a[(i-1)/2] = a[i];
			else
				break;					
		}
		
		a[(i-1)/2]=t;
		return v;
	 }					
	}
	
	boolean empty()
	{
		return index==-1;
	}
	
	
}
