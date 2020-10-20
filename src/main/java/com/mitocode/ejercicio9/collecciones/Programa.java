package com.mitocode.ejercicio9.collecciones;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] lista = new Integer[10];
		
		lista[0] = 5; //unboxing = ASignando un primitivo a un wrapper
		
		int valor = lista[0]; //boxing
		
		System.out.println(valor == lista[0]);
		
	}

}
