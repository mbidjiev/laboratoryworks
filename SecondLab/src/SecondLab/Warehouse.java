package SecondLab;

public class Warehouse {
	int countOfGoods;
	private type type;
	
	public Warehouse (int countOfGoods) {
		this.countOfGoods = countOfGoods;
		this.type = type.Fish;
	}
	public void CheckWarehouse() {
		if(countOfGoods < 10)
		{
			System.out.printf("We need to order %s, because its count - %s", type, countOfGoods);
		}
		else {
		System.out.printf(". Product %s count - %s", type, countOfGoods);
		}
	}
}
