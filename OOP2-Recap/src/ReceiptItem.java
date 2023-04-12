public class ReceiptItem {

	private String Artikel;
	private double preis;
	private int anzahl;
	static double summe;

	public ReceiptItem() {

	}

	public ReceiptItem(String Artikel, int anzahl, double preis) {
		this.Artikel = Artikel;
		this.anzahl = anzahl;
		this.preis = preis;

		summe = summe + (preis * anzahl);

	}

	@Override
	public String toString() {
		return Artikel + " \t" + anzahl + "x \t" + preis;
	}

	public double getSum() {
		summe = summe * 100;
		summe = Math.round(summe);
		summe = summe / 100;

		return summe;
	}

}
