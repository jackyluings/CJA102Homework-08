package hw5;

public class MyRectangleMain {
	
	public static void main (String[] args) {
		MyRectangle area = new  MyRectangle();
		area.setWidth(10);
		area.setDepth(20);
		
		System.out.println(area.getArea());
		System.out.println("=====");
		
		MyRectangle areaConstructor = new  MyRectangle(10,20);
		
		System.out.println(areaConstructor.getArea());
		System.out.println("=====");
		
	}

}
