public class DoublyLinkedLTest {

	public static void main(String[] args) {
		DoublyLinkedL dll=new DoublyLinkedL(10);
		System.out.print("Doubly linked list is: ");
		dll.insert(20);
		dll.insertAtPos(1,30);
		dll.insertFirst(40);
		dll.display();
		dll.delete(20);
		System.out.println();
		dll.display();
	}

}
