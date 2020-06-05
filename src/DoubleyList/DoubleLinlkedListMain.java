package DoubleyList;

public class DoubleLinlkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleLinkedList list=new DoubleLinkedList();
		
		list.createDoubleLinkedList(34);
		
		list.insertDoubleLinkedList(23,1);
		list.insertDoubleLinkedList(56,2);
		list.insertDoubleLinkedList(78,3);
		list.insertDoubleLinkedList(90,4);
		list.insertDoubleLinkedList(65,5);
		
		list.DoubleTraversal();
		
		
		list.deleteDoubleLinkedList(4);
		list.DoubleTraversal();

	}

}
