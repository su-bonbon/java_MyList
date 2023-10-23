package MyList;

public class MyStack {
	
	MyLinkedList stack = new MyLinkedList();
	
	public void push(String s) {
		stack.addFirst(s);
	}
	
	public void pop() {
		stack.removeFirst();
	}
	
	public String peek() {
		return stack.getFirst();
	}
	
	
}
