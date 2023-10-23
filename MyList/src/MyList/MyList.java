package MyList;

public interface MyList {
	public void addFirst(String s);
	public void addLast(String s);
	public void removeFirst();
	public void removeLast();
	public void print();
	public boolean isEmpty();
	public int getSize();
	public boolean search(String s);
}
