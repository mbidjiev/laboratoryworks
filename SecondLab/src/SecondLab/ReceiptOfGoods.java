package SecondLab;

public class ReceiptOfGoods {
	int arrivedGoods; 
	int inOrder; 
	
	public ReceiptOfGoods (int arrivedGoods, int inOrder) {
	this.arrivedGoods = arrivedGoods;
	this.inOrder = inOrder;
	}
	
	public ReceiptOfGoods(ReceiptOfGoods order) {
	}

	public void CheckReceipt() {
		System.out.printf(". Arrived goods - %s, in order - %s", arrivedGoods, inOrder);
		}
	}