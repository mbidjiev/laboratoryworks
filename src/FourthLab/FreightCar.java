package FourthLab;

public class FreightCar extends Car{
	double capacity;
	
	public FreightCar(double capacity) {
		this.capacity = capacity;
	}
	public FreightCar(String country, String model, double engineVol, int horsepower, int speed, int mass, int capacity) {
		this.country = country;
		this.model = model;
		this.engineVol = engineVol;
		this.horsepower = horsepower;
		this.speed = speed;
		this.mass = mass;
		this.capacity = capacity;
	}
	public void FCarInfo() {
	System.out.printf("%s\n", model);
	System.out.printf("Made in  %s\n", country);
	System.out.printf("Volume of engine - %s\n", engineVol);
	System.out.printf("Horse powers - %s\n", horsepower);
	System.out.printf("Maximal speed - %s\n", speed);
	System.out.printf("Mass - %s\n", mass);
	System.out.printf("Capacity - %s", capacity);
	}
}