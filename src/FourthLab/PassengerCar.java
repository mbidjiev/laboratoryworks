package FourthLab;

public class PassengerCar extends Car {
	public PassengerCar(String country, String model, double engineVol, int horsepower, int speed, int mass) {
		this.country = country;
		this.model = model;
		this.engineVol = engineVol;
		this.horsepower = horsepower;
		this.speed = speed;
		this.mass = mass;
	}
	public void CarInfo() {
		System.out.printf("%s\n", model);
		System.out.printf("Made in  %s\n", country);
		System.out.printf("Volume of engine - %s\n", engineVol);
		System.out.printf("Horse powers - %s\n", horsepower);
		System.out.printf("Maximal speed - %s\n", speed);
		System.out.printf("Mass - %s", mass);
	}
}
