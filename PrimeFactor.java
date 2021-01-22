package general_java;

public class PrimeFactor {
	private static boolean isPrime(int num2) {
		Boolean answer = true;
		for(int i=2; i<num2; i++) {
			if(num2%i == 0) {
				answer = false;
			}
		}
		return answer;
	}
	private static String primeFactorer(int num2) {
		int answer = 1;
		for(int i=2; i<num2; i++) {
			if(num2%i == 0 && isPrime(i)) {
				answer = i;
			}
		}
		return "Highest prime factor: "+String.valueOf(answer);
	}
	public static void main(String[] args) {
		System.out.println(primeFactorer(200192));
	}
}
