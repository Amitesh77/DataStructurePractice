package QueueDataStructure;

public class QueueArray {
	
	int[] arr;
	
	int beginningofqueue;
	int topofqueue;
	public QueueArray(int size) {
		
		this.arr = new int[size];
		this.beginningofqueue = -1;
		this.topofqueue =-1;
	}
	
	
	public boolean isQEmpty()
	{
		if(topofqueue==-1)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	public boolean isQFull()
	{
		if(topofqueue==arr.length-1 || beginningofqueue==arr.length)
		{
			
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	public void enqueue(int value)
	{
		if(isQFull())
		{
			System.out.println("Queue is full");
		}
		
		else if(isQEmpty())
		{
			beginningofqueue=0;
			topofqueue++;
			
			arr[topofqueue]=value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}
		
		else
		{
			topofqueue++;
			
			arr[topofqueue]=value;
		}
	}
	
	public void deQueue()
	{
		if(isQEmpty())
		{
			System.out.println("Queue is Empty");
		}
		
		else
		{
			System.out.println("Dequeing value from Queue...");
			
			System.out.println("Dequeued: "+arr[beginningofqueue]+" from queue");
			
			beginningofqueue++;
			
			if(beginningofqueue > topofqueue) { //If last element in the Queue is Dequeued
				beginningofqueue = topofqueue = -1;
			}
			
		}
		
		System.out.println();
	}
	
	public void printQueue()
	{
		if(!isQEmpty()) {
			System.out.println("Queue now ...");
			for(int i=beginningofqueue; i<=topofqueue; i++) {
				System.out.println(arr[i] + "   ");
			}
			System.out.println();
		}else {
			System.out.println("Queue is empty !");
		}
	}
	
	
	
 
}
