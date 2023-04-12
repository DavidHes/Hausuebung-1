import java.util.ArrayList;
import java.util.List;

public class Receipt {

	List<ReceiptItem> artikel = new ArrayList<>();

	public Receipt(String Shopname) {

	}

	public void add(ReceiptItem receiptItem) {
		artikel.add(receiptItem);
	}

	public void print() {
		ReceiptItem r = new ReceiptItem();

		System.out.print("*** HWR Shop ***" + "\n---\n");

		for (ReceiptItem x : artikel) {
			System.out.println(x);
		}

		System.out.print("---\n" + "Summe \t\t" + r.getSum());
	}

}
