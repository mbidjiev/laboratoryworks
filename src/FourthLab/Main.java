package FourthLab;

public class Main {

	public static void main(String[] args) {
		System.out.print("Passenger car: \n");
		PassengerCar car = new PassengerCar ("USA", "Ford Mustang 1969", 7.0, 300, 220, 1600);
		car.CarInfo();
		System.out.println("\n\nFreight car: ");
		FreightCar truck = new FreightCar ("Germany", "Mercedes-Benz Atego", 6.4, 280, 130, 6700, 8000);
		truck.FCarInfo();
		System.out.println("\n\nHelicopter: ");
		Helicopter helic = new Helicopter ("Havoc", "USSR", 300, 7000, 4800, true);
		helic.HelicInfo();
		System.out.println("\n\nShip: ");
		Ship ship = new Ship ("Linkor", "Bismarck", "Germany", 56, 41700);
		ship.ShipInfo();
	}
}
