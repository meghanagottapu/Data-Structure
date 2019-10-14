public class DoublyLinkedL {
	DLLNode head;
	DLLNode tail;
	DoublyLinkedL(){}
	DoublyLinkedL(int d){
		head=new DLLNode(d);
		tail=head;
	}
	void insertFirst(int key) {
		if(head==null) {
			head=new DLLNode(key);
			tail=head;
		}
		else {
			DLLNode temp=new DLLNode(key);
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
	}
	void insert(int key) {
		if(head==null) {
			insertFirst(key);
		}
		else {
			DLLNode temp=new DLLNode(key);
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
	}
	void insertAtPos(int pos,int key) {
		DLLNode temp=new DLLNode(key);
		DLLNode curr=head;
		DLLNode temp2=curr.next;
		curr.next=temp;
		temp.prev=curr;
		temp.next=temp2;
		temp2.prev=temp;
	}
	void delete(int key) {
		if(head==null) {
			System.out.println("DoublyLinkedList is empty");
		}
		else {
			DLLNode temp=new DLLNode(key);
			tail=tail.prev;
			temp=tail;
			temp.next=null;
		}
	}
	public void display()
	{
		DLLNode curr;
		curr=head;
		while(curr!=null)
			{
			System.out.print(curr.data+" ");
			curr=curr.next;
			}
	}
}
