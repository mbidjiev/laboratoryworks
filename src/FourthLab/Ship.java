package FourthLab;

public class Ship extends Tech{
	String type;
	String model;
	
	public Ship (String type, String model, String country, int speed, int mass) {
		this.country = country;
		this.speed = speed;
		this.mass = mass;
		this.model = model;
		this.type = type;
	}
	public void ShipInfo() {
		System.out.printf("Ship type - %s\n", type);
		System.out.printf("Model - %s\n", model);
		System.out.printf("Country - %s\n", country);
		System.out.printf("Mass - %s\n", mass);
		System.out.printf("Speed - %s\n", speed);
	}
}
