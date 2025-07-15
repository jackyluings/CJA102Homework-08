package hw5Ext;

public class Pencil extends Pen {

	public double getPrice() {
		double sum = super.getPrice();
		return sum * 0.8;
	} //override 定價為售價

	public void write() {
		System.out.println("Pencil削鉛筆再寫!");
	} //實作寫法

}
