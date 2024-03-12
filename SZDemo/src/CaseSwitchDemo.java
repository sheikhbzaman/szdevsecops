import java.util.Scanner;

public class CaseSwitchDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter your grade: ");
		
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		
		sc.close();

		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
		case 'C':
			System.out.println("Well Done");
			break;
		case 'D':
			System.out.println("You Passed");
			break;
		case 'F':
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid Grade");
		}
		System.out.println("Your Grade is: " + grade);
	}

}
