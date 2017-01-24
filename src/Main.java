import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double d = scanner.nextDouble();
		char c = scanner.next().charAt(0);
		double d2 = scanner.nextDouble();
		
		switch (c) {
		case '+':
			System.out.println(d+d2);
			break;

		default:
			break;
		}

	}

}
