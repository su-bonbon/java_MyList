package MyList;

public class MyStack {
	int top;
	
	MyLinkedList stack = new MyLinkedList();
	
	public void push(String s) {
		stack.addFirst(s);
		top = getSize();
	}
	
	public void pop() {
		stack.removeFirst();
		top = getSize();
	}
	
	public String peek() {
		return stack.getFirst();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int getSize() {
		return stack.getSize();
	}
	
	public boolean search (String key) {
		return stack.search(key);
	}
	
	public void print() {
		stack.print();
	}
}
