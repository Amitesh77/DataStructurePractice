package DoubleyList;

public class DoubleLinkedList {
	
	private DoubleNode head;
	private DoubleNode tail;
	private int size;
	
	
	
	public DoubleNode getHead() {
		return head;
	}

	public void setHead(DoubleNode head) {
		this.head = head;
	}

	public DoubleNode getTail() {
		return tail;
	}

	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public DoubleNode createDoubleLinkedList(int value)
	{
		DoubleNode node=new DoubleNode();
		
		node.setValue(value);
		
		node.setPrevious(null);
		node.setNext(null);
		
		
		head=node;
		tail=node;
		size=1;
		return head;
	}
	
	
	public void insertDoubleLinkedList(int value,int location)
	{
		DoubleNode node=new DoubleNode();
		node.setValue(value);
		
		if(!existsDoubleList())
		{
			System.out.println("Double LinkedList does not exist");
			return;
		}
		
		else if(location==0)
		{
			node.setPrevious(null);
			node.setNext(head);
			head.setPrevious(node);
			head=node;

		}
		
		else if(location>=getSize())
		{
			node.setNext(null);
			tail.setNext(node);
			node.setPrevious(tail);
			tail=node;
		}
		
		else
		{
			DoubleNode tempnode=head;
			
			int index=0;
			
			while(index<location-1)
			{
				tempnode=tempnode.getNext();
				index++;
			}
			
			node.setPrevious(tempnode);
			node.setNext(tempnode.getNext());
			tempnode.setNext(node);
			node.getNext().setPrevious(node);
			
		}
		
		setSize(getSize()+1);
		
	}
		public void DoubleTraversal()
		{
			
			
			if(existsDoubleList())
			{
				DoubleNode tempnode=head;
				
				for (int i = 0; i <getSize(); i++) 
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
				System.out.println("Double List does not exist");
			}
			
			System.out.println("\n");
		}
		
		public void deleteDoubleLinkedList(int location)
		{
			
			if(!existsDoubleList())
			{
				System.out.println("List does not exist");
				return;
			}
			
			else if(location==0)
			{
				if(getSize()==1)
				{
					head=tail=null;
					setSize(getSize()-1);
					return;
				}
				
				head=head.getNext();
				head.setPrevious(null);
				
				setSize(getSize()-1);
				
			}
			
			else if(location>=getSize())
			{
				
				DoubleNode tempnode=tail.getPrevious();//temp points to 2nd last node
				
				if(tempnode==head)
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
				DoubleNode tempnode=head;
				for (int i = 0; i < location-1; i++) {
					tempnode=tempnode.getNext();
					}
				
				tempnode.setNext(tempnode.getNext().getNext());
				tempnode.getNext().setPrevious(tempnode);
				setSize(getSize()-1);
				
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	public boolean existsDoubleList()
	{
		return head!=null;
	}

}
