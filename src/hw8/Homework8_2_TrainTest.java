package hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Homework8_2_TrainTest {

	public static void main(String[] args) {
		// 火車時刻表

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		// 印出不重複的火車時刻表===================HashSet

		System.out.println("印出不重複的火車時刻表");
		System.out.println("<使用HashSet>");
		Set<Train> set = new HashSet<Train>();
		set.add(t7);
		set.add(t6);
		set.add(t5);
		set.add(t4);
		set.add(t3);
		set.add(t2);
		set.add(t1);
		//
		System.out.println("<使用foreach取值>");
		for (Train t01 : set) {
			System.out.println(t01);
		}
		System.out.println("=====");
		//
		System.out.println("<使用迭代器取值>");
		Iterator<Train> objs = set.iterator();
		while (objs.hasNext()) {
			Train t01 = objs.next();
			System.out.println(t01);
		}
		System.out.println("=====");
		//

		// 印出以班次編號由大到小的火車時刻表===================
		// Arrays=============================================
		
		System.out.println("印出以班次編號由大到小的火車時刻表");
		System.out.println("<使用傳統陣列>");
		Train t[] = new Train[7];
		t[0] = t1;
		t[1] = t2;
		t[2] = t3;
		t[3] = t4;
		t[4] = t5;
		t[5] = t6;
		t[6] = t7;

		Arrays.sort(t);// 排序
		//
		System.out.println("<使用foreach取值>");
		for (Train t01 : t) {
			System.out.println(t01);
		}
		System.out.println("=====");
		//
		System.out.println("<使用for取值>");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		System.out.println("=====");

		// ArrayList=======================================
		
		System.out.println("<使用ArrayList>");
		System.out.println("=====");
		List<Train> list = new ArrayList<Train>();
		list.add(t7);
		list.add(t6);
		list.add(t5);
		list.add(t4);
		list.add(t3);
		list.add(t2);
		list.add(t1);
		list.sort(Comparator.naturalOrder());
		//
		System.out.println("<使用for取值>");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		System.out.println("=====");
		//
		System.out.println("<使用foreach取值>");
		for (Train t01 : list) {
			System.out.println(t01);
		}
		System.out.println("=====");

		//印出以班次編號由大到小且不重複的火車時刻表===================
		//TreeSet===================
		
		System.out.println("印出以班次編號由大到小且不重複的火車時刻表");
		System.out.println("<使用TreeSet>");
		Set<Train> set2 = new TreeSet<Train>();
		set2.add(t7);
		set2.add(t6);
		set2.add(t5);
		set2.add(t4);
		set2.add(t3);
		set2.add(t2);
		set2.add(t1);
		//
		System.out.println("<使用foreach取值>");
		for (Train t01 : set2) {
			System.out.println(t01);
		}
		System.out.println("=====");
		//
		System.out.println("<使用迭代器取值>");
		Iterator<Train> objs2 = set2.iterator();
		while (objs2.hasNext()) {
			Object t01 = objs2.next();
			System.out.println(t01);
		}
		System.out.println("=====");

	}

}
