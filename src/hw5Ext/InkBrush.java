package hw5Ext;

public class InkBrush extends Pen {

	public double getPrice() {
		double sum = super.getPrice();
		return sum * 0.9;
	}
	public void write() {
		System.out.println("InkBrush沾墨汁再寫!");
	}

}
