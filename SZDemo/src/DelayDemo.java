
public class DelayDemo {

	public static void main(String[] args) {
		System.out.println("Hi");
		for (int i = 0; i < 5; i++) {
			System.out.println("Number of itaration = " + i);
			System.out.println("Wait...");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}

	}

}
