package general_java;

public class PackageRiceBags {
	private static String packager(double ones, double fives, double total) {
		double fivesNeeded = Math.floor(total/5);
		double totalNeeded = total;
		if(fivesNeeded<fives) {
			fives = fivesNeeded;
		}
		total = total - fives * 5;
		if(total>ones) {
			double current = ones + fives*5;
			return ("FAIL: Not enough rice.\nYou want: "+totalNeeded+" kgs\nYou have: "+String.valueOf(current)+" kgs");
		}else {
			ones = total;
			String answer = ("No. 5kg Bags: "+String.valueOf(fives)+"\nNo. 1kg Bags: "+String.valueOf(ones));
			return answer;
		}
	}
	public static void main(String[] args) {
		System.out.print(packager(0,4,78));
	}
}
