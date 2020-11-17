package ThirdLab;
import java.util.Scanner;

public class Main {
	public static void main (String args[]){
		double d1, d2, sum; //fractions
		double n1, m1, n2, m2; //numerators and denominators
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator and denominator of the first fraction");
		n1 = sc.nextInt();
		m1 = sc.nextInt();
		d1 = n1/m1;
		System.out.printf("First fraction - %s/%s, or %s\n", n1, m1, d1);
		System.out.println("Enter the numerator and denominator of the second fraction");
		n2 = sc.nextInt();
		m2 = sc.nextInt();
		d2 = n2/m2;
		System.out.printf("Second fraction - %s/%s, or %s\n", n2, m2, d2);
		sum = d1 + d2;
		System.out.printf("Result of addition - %s\n", sum);
	}
}