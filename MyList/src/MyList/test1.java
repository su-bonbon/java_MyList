package MyList;

public class test1 {

	public class PerfomanceTest{
		public static void main(String[] args) {
		// getTime(100000);
		getTime(1000000);
		}
		public static void getTime(int n) {
		//int[] list = random(n);
		int[] list = sorted(n);
		long startTime = System.currentTimeMillis();
		simpleLoop(n);
		//bubbleSort(list);
		//mergeSort(list);
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time for n = " + n + " is "
		+ (endTime - startTime) + " milliseconds.");
		}
		private static int[] random(int n) {
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
		list[i] = (int) (Math.random() * 1000);
		}
		return list;
		}
		private static int[] sorted(int n) {
		int[] list = new int[n];
		for (int i = 0; i < n; i++)
		list[i] = i;
		return list;
		}
		private static void simpleLoop(int n){
		int k = 0;
		for(int i= 1; i <= n; i++)
		k = k+5;
		}
		}
}
