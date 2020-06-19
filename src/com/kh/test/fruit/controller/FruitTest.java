package com.kh.test.fruit.controller;

import java.util.ArrayList;

import com.kh.test.fruit.model.vo.Fruit;
public class FruitTest {
	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		Fruit a = new Fruit("사과", "달콤");
//		list.add(new Fruit("사과", "달콤"));
		list.add(a);
		list.add(new Fruit("오렌지", "상큼"));
		list.add(new Fruit("키위", "상큼"));
		
		System.out.println("값 삽입 : " + list);

		// 삭제되는 객체 반환
		list.remove(1);
		System.out.println("값 삭제1 : " + list);
		
		Fruit b = new Fruit("사과", "달콤");
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
		
		if (list.get(0).equals(new Fruit("사과", "달콤"))) {
			list.remove(list.get(0));
		}
		
//		list.remove(list.get(0).equals(b));
//		System.out.println(list.remove(b));
		System.out.println("값 삭제2 : " + list);
	}
}
