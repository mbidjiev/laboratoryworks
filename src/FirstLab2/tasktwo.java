package FirstLab2;

import java.util.ArrayList;
import java.util.Scanner;

public class tasktwo {
	private ArrayList<Double> aa = new ArrayList<Double>();
	private int N;
	
	public void InputArray()
	{
		aa.clear();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of numbers: ");
		N = sc.nextInt();
		double a;
		for (int i=0; i<N; i++) {
			System.out.print("Enter number " + String.valueOf(i+1) + " > ");
			a = sc.nextDouble();
			aa.add(a);
	}
	sc.close();
}
	public void PrintResult()
	{
		double b=0;
		System.out.println("Resulting sequence: 2");
		for (int i=0; i<N; i++) {
			b+=(Math.pow(aa.get(i), 2));
			System.out.println(b);
		}
	}
}
