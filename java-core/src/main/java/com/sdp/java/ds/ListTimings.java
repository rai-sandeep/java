package com.sdp.java.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTimings {

	public static void main(String[] args) {
		compareArrayListLinkedList();
	}

	private static void compareArrayListLinkedList() {
		
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		System.out.println("Operation\t| ArrayList\t| LinkedList");
		System.out.println("--------------------------------------------");


		System.out.print("Add At End\t| ");
		int size = 50000000;
		long start = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
		    arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.print(end - start + " ms\t| ");

		start = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
		    linkedList.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + " ms");


		System.out.print("Add At Index\t| ");
		size = 250;
		start = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
		    arrayList.add(i, i);
		}
		end = System.currentTimeMillis();
		System.out.print(end - start + " ms\t| ");

		start = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
		    linkedList.add(i, i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + " ms");
		
		
		System.out.print("Get By Index\t| ");
		size = 50000;
		start = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
		    arrayList.get(i);
		}
		end = System.currentTimeMillis();
		System.out.print(end - start + " ms\t\t| ");

		start = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
		    linkedList.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + " ms");
		
		
		System.out.print("Get By Iterator\t| ");
		start = System.currentTimeMillis();
		for (Iterator<Integer> i = arrayList.iterator(); i.hasNext();) {
			i.next();
		}
		end = System.currentTimeMillis();
		System.out.print(end - start + " ms\t\t| ");

		start = System.currentTimeMillis();
		for (Iterator<Integer> i = linkedList.iterator(); i.hasNext();) {
			i.next();
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + " ms");

		
		System.out.print("Remove By Value\t| ");
		size = 250;
		start = System.currentTimeMillis();
		for(int i = size; i >= 0 ; i--) {
		    arrayList.remove(Integer.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.print(end - start + " ms\t| ");

		start = System.currentTimeMillis();
		for(int i = size; i >= 0 ; i--) {
		    linkedList.remove(Integer.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + " ms");

		
		System.out.print("Remove By Index\t| ");
		size = 250;
		start = System.currentTimeMillis();
		for(int i = size; i >= 0 ; i--) {
		    arrayList.remove(i);
		}
		end = System.currentTimeMillis();
		System.out.print(end - start + " ms\t| ");

		start = System.currentTimeMillis();
		for(int i = size; i >= 0 ; i--) {
		    linkedList.remove(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + " ms");
		
	}

}
