package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getStart() {
		return start;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getDest() {
		return dest;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}


	public Train(int number, String type, String start, String dest, double price) {
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		setPrice(price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, type, start, dest, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number;
	}

	@Override
	public int compareTo(Train o) {
		if (this.number > o.number) {
			return -1;
		} else if (this.number == o.number) {
			return 0;
		} else {
			return 1;
		}
	}

	public String toString() {
		return "班次:" + number + ",車種:" + type + ",出發地:" + start + ",目的地:" + dest + ",票價:" + price + "元";
	}

}
