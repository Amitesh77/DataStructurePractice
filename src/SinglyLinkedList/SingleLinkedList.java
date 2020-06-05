package SinglyLinkedList;

public class SingleLinkedList {
	
	private SingleNode head;
	private SingleNode tail;
	
	private int size;
	
	
	public SingleNode createLinkedList(int nodevalue)
	{
		//head=new SingleNode();
		
		SingleNode node=new SingleNode();
		
		node.setValue(nodevalue);
		node.setNext(null);
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




	public void inserinLinkedList(int nodevalue,int location)
	{
		SingleNode node=new SingleNode();
		node.setValue(nodevalue);
		
		if(!existsLinkedList())
		{
			System.out.println("LinkedList Does not Exist !!!!");
			return;
		}
		
		else if(location==0)
		{
			node.setNext(head);
			
			head=node;
		}
		
		else if(location>=size)
		{
			node.setNext(null);
			tail.setNext(node);
			tail=node;
		}
		
		else
		{
			SingleNode tempNode=head;
			
			int index=0;
			
			while(index<location-1)
			{
				tempNode=tempNode.getNext();
				index++;
			}//tempNode currently references the node after which we have to insert
			
			SingleNode nextnode=tempNode.getNext();  //next immediate node
			tempNode.setNext(node);
			node.setNext(nextnode);
			
		}
		
		setSize(getSize()+1);
		
	}
	
	
	public boolean existsLinkedList()
	{
		if(head!=null)
		{
			return true;
		}
		return false;
	}
	
	
	public void Traversal()
	{
		if(existsLinkedList())
		{
			SingleNode tempnode=head;
			
			for (int i = 0; i < getSize(); i++) 
			{
				
				System.out.print(tempnode.getValue());
				
				if(i!=getSize()-1)
				{
					System.out.print("-->");
				}
				
				
					tempnode=tempnode.getNext();
				
				
			}
			
		}
		
		else
		{
			System.out.println("LinkedList does not exist");
		}
		
		System.out.println("\n");
	}
	
	
	public void SearchLinkedlist(int value)
	{
		SingleNode tempnode=head;
		
		
			
			if(existsLinkedList())
				
			{
				
			for (int i = 0; i <size; i++)
				
			{
				
			if(tempnode.getValue()==value)
				
			{
				System.out.println("Node found at  :"+i);
			}
			tempnode=tempnode.getNext();
			
			}
			
			}
			
			else
			{
				System.out.println("LinkedList does not exist");
			}
		
			
		
	}
	
	
	
	
	public void deleteNode(int location)
	{
		if(!existsLinkedList())
		{
			System.out.println("Linked List does not exist");
			return;
		}
		
		else if(location==0)
		{
			head=head.getNext();
			setSize(getSize()-1);
			
			if(getSize()==0)
			{
				tail=null;
			}
		}
		
		else if(location>=getSize())
		{
			SingleNode tempnode=head;
			
			for (int i = 0; i < size-1; i++) {
			
				tempnode=tempnode.getNext();//tempnode points to 2nd last node
			}
			
			if(tempnode==head)  //if it is the only node
			{
				tail=head=null;
				
				setSize(getSize()-1);
				
				return;
				
			}
			
			tempnode.setNext(null);
			tail=tempnode;
			
			setSize(getSize()-1);
		}
		
		else
		{
			SingleNode tempnode=head;
			
			
			for (int i = 0; i <location-1; i++) {
				
				tempnode=tempnode.getNext();
				
			}
			
			tempnode.setNext(tempnode.getNext().getNext());
			
			setSize(getSize()-1);
		}
	}
	
	
	public void reverLinkedList()
	{
		SingleNode tempnode=head;
		
		SingleNode current=null,previous=null;
		
		
		while(tempnode!=null)
		{
			current=tempnode;
			tempnode=tempnode.getNext();
			
			current.setNext(previous);
			previous=current;
			head=current;
					
		}
		
		
	}
	
	
	public void reversalRecursion()
	{
		SingleNode current=head;
		SingleNode previous=null,next=null;
		
		while(current!=null)
		{
			next=current;
			current=current.getNext();
			
			next.setNext(previous);
			previous=next;
			
			head=next;
		}
	}
	
	
	public void kthfromLast(int n)
	{
		SingleNode fast=head;
		SingleNode slow=head;
		
		
		for (int i = 0; i <= n; i++) {
			
			fast=fast.getNext();
			
		}
		
		while(fast!=null)
		{
			fast=fast.getNext();
			slow=slow.getNext();
		}
		
		System.out.println(slow.getValue());
		//return slow;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
