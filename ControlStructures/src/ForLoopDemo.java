public class ForLoopDemo {

	public static void main(String[] args) {
		for (int count = 1; count <= 10; count++) {
			System.out.println("Hi...");
		}
		int num = 5;
		for (int count = 1; count <= 10; count++) {
			System.out.println(num + " x " + count + " = " + (num * count));
		}

		/**
		 * * *
		 *
		 * *
		 * **/

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (row == col || row + col == 4) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
