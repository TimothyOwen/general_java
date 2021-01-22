package general_java;

public class GreatestCommonDivisor {
	public static String common(int p, int q) {
		int answer = 1;
		int highest = 1;
		if(p>=q) {highest = p;}
		if(q>p) {highest = q;}
		for(int i=1; i<=highest; i++) {
			if(p%i==0 && q%i==0) {
				answer = i;
			}
		}
		return String.valueOf(answer);
	}
	public static void main(String[] args) {
		System.out.println("The Greatest Common Divisor: "+common(81,74));
	}
}
