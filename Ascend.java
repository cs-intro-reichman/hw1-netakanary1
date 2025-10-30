// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int maxRange = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * maxRange) + 1;
		int b = (int) (Math.random() * maxRange) + 1;
		int c = (int) (Math.random() * maxRange) + 1;
		int max, min, mid;
		// Finding the maximum number
		max = Math.max(a, b);
		max = Math.max(max, c);
		// Finding the minimum number
		min = Math.min(a, b);
		min = Math.min(min, c);
		// Finding the middle number
		mid = a + b + c - max - min;

		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + mid + " " + max);

	}
}
