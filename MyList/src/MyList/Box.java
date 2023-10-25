package MyList;

public class Box {

	private Object item;
	public void setItem(Object item) {
		this.item = item;
	}
	public Object getItem() {
		return item;
	}


	public static void main(String[] x) {
		Box b = new Box();
		b.setItem("abc");
		
		int a = (int) b.getItem();
	}
}