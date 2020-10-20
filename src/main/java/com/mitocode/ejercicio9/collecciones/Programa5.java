package com.mitocode.ejercicio9.collecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Programa5 {

	
	public static int ELEMENTOS = 5000;
	
	public static void main(String[] args) {	
		// creamos 2 listas
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
	
		// Agregar
		System.out.println("****** Agregar *******");
		long start = System.currentTimeMillis();
		
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			arrayList.add("elemento #" + i);
		}
		long fin = System.currentTimeMillis() - start;
		System.out.println("Arraylist: " + fin + " ms");
		
		
		start = System.currentTimeMillis();
		
		// LinkedList
		for (int i = 0; i < ELEMENTOS; i++) {
			linkedList.add("elemento #" + i);
		}
		fin = System.currentTimeMillis() - start;
		System.out.println("LinkedList: " + fin + " ms");
		
		// Obtener
		System.out.println("****** Obtener *******");
		start = System.currentTimeMillis();
		
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			arrayList.get(i);
		}
		fin = System.currentTimeMillis() - start;
		System.out.println("Arraylist: " + fin + " ms");
		
		
		start = System.currentTimeMillis();
		
		// LinkedList
		for (int i = 0; i < ELEMENTOS; i++) {
			linkedList.get(i);
		}
		fin = System.currentTimeMillis() - start;
		System.out.println("LinkedList: " + fin + " ms");
		
		// Modificar
		System.out.println("****** Modificar *******");
		start = System.currentTimeMillis();
		
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			arrayList.set(i, "elemento #" + i);
		}
		fin = System.currentTimeMillis() - start;
		System.out.println("Arraylist: " + fin + " ms");
		
		
		start = System.currentTimeMillis();
		
		// LinkedList
		for (int i = 0; i < ELEMENTOS; i++) {
			linkedList.set(i,"elemento #" + i);
		}
		fin = System.currentTimeMillis() - start;
		System.out.println("LinkedList: " + fin + " ms");
		
		
		// Eliminar
		System.out.println("****** Eliminar *******");
		start = System.currentTimeMillis();
		
		// ArrayList
		for (int i = 0; i < ELEMENTOS; i++) {
			arrayList.remove(0);
		}
		fin = System.currentTimeMillis() - start;
		System.out.println("Arraylist: " + fin + " ms");
		
		
		start = System.currentTimeMillis();
		
		// LinkedList
		for (int i = 0; i < ELEMENTOS; i++) {
			linkedList.remove(0);
		}
		fin = System.currentTimeMillis() - start;
		System.out.println("LinkedList: " + fin + " ms");

		
		
		
		
		
		
		
		
		

	}

}
