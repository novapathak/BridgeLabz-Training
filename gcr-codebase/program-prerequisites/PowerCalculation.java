import java.util.*;
class PowerCalculation {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int expo = sc.nextInt();
		int Result = (int)(Math.pow(base,expo));
		System.out.println( Result);
	}
}