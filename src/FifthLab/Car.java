package FifthLab;

import java.util.Scanner;

public class Car extends Tech implements CarNumber{
	String model;
	double engineVol;
	int horsepower;
	public Car() {}

	public void CarNumber() {
		System.out.println("\n\nEnter car's number: ");
		String[] arr = new String[10];
		Scanner sc = new Scanner(System.in);
        String input;
        for (int i = 0; i<10; i++) {
            input = sc.nextLine();
            arr[i] = input;
        }
        for (int i = 0; i<10; i++) {
        	System.out.printf("\nNumber of the car %s - %s", i, arr[i]);
        }
	}
}
