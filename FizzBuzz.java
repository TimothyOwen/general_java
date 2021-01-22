package general_java;

public class FizzBuzz {
	private static String check(int num2) {
		String answer = "";
		if(num2%3 == 0) {
			answer += " Fizz";
			if(num2%5 == 0) {
				answer += " Buzz";
			}
			return answer;
		}
		if(num2%5 == 0) {
			answer += " Buzz";
			return answer;
		}else {
			answer = String.valueOf(num2);
			return answer;
		}
	}
	public static void main(String[] args) {
		System.out.print(check(15));
	}
}
