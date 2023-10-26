package MyList;

public class Box<T> {

	private T item;
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}


	public static void main(String[] x) {
		Box b = new Box();
		b.setItem("abc");
		
		String a = (String) b.getItem();
		
		Box<Integer> c = new Box<Integer>();
		c.setItem(1);
	}
}