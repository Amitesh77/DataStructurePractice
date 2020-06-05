package SinglyLinkedList;

public class SingleCircularLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleCircularLinkedList list=new SingleCircularLinkedList();
		
		list.createCircularLinkedList(29);
		
		list.insertInSinglecircular(22,1);
		list.insertInSinglecircular(45,2);
		list.insertInSinglecircular(67,3);
		list.insertInSinglecircular(876,4);
		list.insertInSinglecircular(87,5);
		list.insertInSinglecircular(23,6);
		
		
		list.searchSingleCircularLinkedList(87);
		list.TraverseSingleCircularLinkedList();

		list.deletionSingleCircularLinkedList(5);
		list.TraverseSingleCircularLinkedList();

	}

}
