package MyList;

public interface MyList<E> {
	public void addFirst(E s);
	public void addLast(E s);
	public void removeFirst();
	public void removeLast();
	public void print();
	public boolean isEmpty();
	public int getSize();
	public boolean search(E s);
}
