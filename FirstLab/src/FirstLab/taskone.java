package FirstLab;

import java.util.ArrayList;
import java.util.Scanner;
public class taskone {
	public static void DoTask()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of numbers > ");
		int N = sc.nextInt();
		
		double a;
		ArrayList<Double> aa = new ArrayList();
		
		//fill list with numbers
		for(int i=0; i<N; i++) {
			System.out.print("Enter number " + String.valueOf(i+1) + " > ");
			a = sc.nextDouble();
			aa.add(a);
		}
		double b = 0;
		System.out.println("Resulting sequence: 1");
		//output of resulting sequence
		for (int i=0; i<N; i++) {
			b+=(Math.pow(aa.get(i), 2));
			System.out.println(b);
		}
		sc.close();
	}
}
