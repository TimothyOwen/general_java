package general_java;

public class PrimeNumber {
	private static String primeCheck(int num2) {
		String answer = "Prime";
		for(int i=2; i<num2; i++) {
			if(num2%i == 0) {
				System.out.println(i);
				answer = "Not Prime";
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(primeCheck(57));
	}
}
