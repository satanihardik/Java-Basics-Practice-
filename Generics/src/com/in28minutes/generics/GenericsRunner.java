package com.in28minutes.generics;
public class GenericsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element-1");
		list.addElement("Element-2");
		System.out.println(list);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(9));
		System.out.println(list2);
	}

}
