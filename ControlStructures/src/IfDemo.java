public class IfDemo {

	public static void main(String[] args) {

		/*
		 * if (false) { System.out.println("If condition is evaluated");
		 * System.out.println("Second line"); }
		 */
		int age = 2;
		if (age > 18) {
			System.out.println("Person can vote");
		} else {
			System.out.println("Person can not vote");
		}
		System.out.println("Normal execution");

		String ans = age > 10 ? "Person can vote" : "Person can not vote";
		System.out.println(ans);
	}

}
