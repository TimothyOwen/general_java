package general_java;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner dashboard = new Scanner(System.in);
		System.out.println("Enter it: ");
		String choice = dashboard.next();
		System.out.println(choice);
	}
}