public class WhileDemo {

	public static void main(String[] args) {
		int count = 11;
		int num = 5;
		while (count <= 10) {
			System.out.println(num + " x " + count + " = " + (num * count));
			count++;
		}
		System.out.println();
		System.out.println();
		count =11;
		do {
			System.out.println(num + " x " + count + " = " + (num * count));
			count++;
		} while (count <= 10);
	}

}
