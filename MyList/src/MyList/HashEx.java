package Attention;

public class HashEx<E> {
	private final int myKey = 14;
	private E query;  
	private E val;  
	
	public E getQuery() {
		return query;
	}

	public E getVal() {
		return val;
	}

	// Constructor with two parameter
	public HashEx(E str1, E str2) {
		this.query = str1;
		this.val = str2;
	}

	@Override
	// Customized hash function using myKeyS
	public int hashCode() {
		
        return (query.hashCode() * val.hashCode()) * myKey;
    }
	
	public static void main(String[] args) {
		HashEx<String> test1 = new HashEx<>("Attention", " is all you need.");
		
		// print custom encoded value
		System.out.println("Decoded: " + test1.getQuery() + test1.getVal());
		System.out.println("Encoded: " + test1.hashCode());
	}

}
