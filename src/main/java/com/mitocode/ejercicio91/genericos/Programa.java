package com.mitocode.ejercicio91.genericos;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	
	public static void main(String[] args) {
		//operador diamante con estereotipo
//		List<String> lista = new ArrayList<>();
//		lista.add("Dany");
//		System.out.println(lista.get(0));
//		
//		ClaseA<String> c1 = new ClaseA<>("Dany");
//		c1.mostrarTipo();
//		
//		ClaseA<Integer> c2 = new ClaseA<>(6);
//		c2.mostrarTipo();
		
		
		ClaseB<String, Integer, String, Double> cb1 = new ClaseB<>("Jean",22, "Cochachin",125.6);
		cb1.mostrarTipo();
	}
}
