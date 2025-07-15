package hw5Ext;

public abstract class Pen {
	private String brand;
	private double price;

	Pen() {
	};

	Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;

	}

	Pen(double price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public abstract void write();

}
