package SinglyLinkedList;

public class SingleCircularLinkedList {
	
	private SingleNode head;
	private SingleNode tail;
	
	int size=0;
	
	
	public SingleNode createCircularLinkedList(int value)
	{
		SingleNode node=new SingleNode();
		
		node.setValue(value);
		
		node.setNext(node);
		head=node;
		tail=node;
		
		
		size=1;
		return head;
	}
	
	
	
	public SingleNode getHead() {
		return head;
	}



	public void setHead(SingleNode head) {
		this.head = head;
	}



	public SingleNode getTail() {
		return tail;
	}



	public void setTail(SingleNode tail) {
		this.tail = tail;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public void insertInSinglecircular(int value,int location)
	{
		SingleNode node =new SingleNode();
		
		node.setValue(value);
		if(!existsCircularSingle())
		{
			System.out.println("Single Circular Linked List does not exist");
			return;
		}
		
		else if(location==0)
		{
			node.setNext(head);
			head=node;
			tail.setNext(node);
		}
		
		else if(location>=0)
		{
			tail.setNext(node);
			tail=node;
			node.setNext(head);
			
			//tail.setNext(head);
		}
		
		else
		{
			SingleNode tempnode=head;
			
			int index=0;
			
			while(index<location-1)
			{
				
				tempnode=tempnode.getNext();
				
				index++;
				
			}
				//tempnode.setNext(node);
				//tempnode=node;
			
			node.setNext(tempnode.getNext());
			
			tempnode.setNext(node);
			
		}
		
		setSize(getSize()+1);
		
		
	}
	
	
	
	public boolean existsCircularSingle()
	{
		if(head!=null)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	public void TraverseSingleCircularLinkedList()
	{
		if(existsCircularSingle())
		{
			SingleNode tempnode=head;
			
			
			for (int i = 0; i <size; i++) {
				
				System.out.print(tempnode.getValue());
				
				if(i!=size-1)
				{
					System.out.print("-->");
				}
				
				tempnode=tempnode.getNext();
				
			}
			
			
			System.out.println("\n");
		}
		
		else
		{
			System.out.println("circular Single LinkedList does not exist");
		}
	
		
	}
	
	public void searchSingleCircularLinkedList(int value)
	{
		if(existsCircularSingle())
		{
			SingleNode tempnode=head;
			
			for (int i = 0; i <size; i++) {
				
				if(tempnode.getValue()==value)
				{
					System.out.println("The node value is found at  :"+i);
				}
				
				tempnode=tempnode.getNext();
				
			}
			
		}
		
		else
		{
			System.out.println("the Single Circular LinkedList does not exist");
		}
	}
	
	
	public void deletionSingleCircularLinkedList(int location)
	{
		if(!existsCircularSingle())
		{
			System.out.println("the Single Circularrrr LinkedList does not exist");
			return;
			
		}
		
		else if(location==0)
		{
			head=head.getNext();
			tail.setNext(head);
			setSize(getSize()-1);
			
			if(getSize()==0)
			{
				tail=null;
			}
			
		}
		
		else if(location>=getSize())
		{
			SingleNode tempnode=head;
			
			for (int i = 0; i < size; i++) {
				
				tempnode=tempnode.getNext(); //tempnode points the second last node
			}
			
			if(tempnode==head)
			{
				tail=head=null;
				setSize(getSize()-1);
				return;
			}
			tempnode.setNext(head);
			tail=tempnode;
			setSize(getSize()-1);
		}
		
		else
		{
			SingleNode tempnode=head;
			
			for (int i = 0; i < location-1; i++) {
				
				tempnode=tempnode.getNext();
			}
			
			tempnode.setNext(tempnode.getNext().getNext());
			setSize(getSize()-1);
			
			
		}
	}
	

}
