import java.util.*;

public class LeapYearExample {

	public static void main(String[] args) {
		System.out.println("Enter the Year:");

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 100 == 0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Common Year");
		}

	}

}
