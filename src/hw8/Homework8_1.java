package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework8_1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		// use iterator
		System.out.println("使用迭代器");
		Iterator objs = list.iterator();
		while (objs.hasNext()) {
			System.out.println(objs.next());
		}
		System.out.println("=====");
		
		// use for
		System.out.println("使用for迴圈");
		for (int i = 0; i < list.size(); i++) {
			Object data = list.get(i);
			System.out.println(data);
		}
		System.out.println("=====");

		// use for each
		System.out.println("使用foreach迴圈");
		for (Object data2 : list) {
			System.out.println(data2);
		}
		System.out.println("=====");

		// remove number
		Iterator objs2 = list.iterator();
		while (objs2.hasNext()) {
			if (objs2.next() instanceof Number) {
				objs2.remove();
			}
		}
		
		// check result
		System.out.println("顯示刪除Number相關的物件");
		Iterator objs3 = list.iterator();
		while (objs3.hasNext()) {
			System.out.println(objs3.next());
		}
		System.out.println("=====");

	}

}
