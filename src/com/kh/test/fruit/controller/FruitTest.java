package com.kh.test.fruit.controller;

import java.util.ArrayList;

import com.kh.test.fruit.model.vo.Fruit;
public class FruitTest {
	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		Fruit a = new Fruit("���", "����");
//		list.add(new Fruit("���", "����"));
		list.add(a);
		list.add(new Fruit("������", "��ŭ"));
		list.add(new Fruit("Ű��", "��ŭ"));
		
		System.out.println("�� ���� : " + list);

		// �����Ǵ� ��ü ��ȯ
		list.remove(1);
		System.out.println("�� ����1 : " + list);
		
		Fruit b = new Fruit("���", "����");
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
		
		if (list.get(0).equals(new Fruit("���", "����"))) {
			list.remove(list.get(0));
		}
		
//		list.remove(list.get(0).equals(b));
//		System.out.println(list.remove(b));
		System.out.println("�� ����2 : " + list);
	}
}
