package SecondLab;

public class Main {
	public static void main(String[] args)
	{
		Products product = new Products(200, 20, true);
		product.CheckProduct();
		ReceiptOfGoods receipt = new ReceiptOfGoods(30, 56);
		receipt.CheckReceipt();
		Warehouse warehouse = new Warehouse(15);
		warehouse.CheckWarehouse();
	}
}
