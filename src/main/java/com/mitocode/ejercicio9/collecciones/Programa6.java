package com.mitocode.ejercicio9.collecciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programa6 {

	public static void main(String[] args) {
		
		
		String[] colores = {"negro", "amarillo", "verder", "azul", "violeta"};
		
		//pasar el array a una colleccion
		List<String> lista = Arrays.asList(colores);
		System.out.println(lista);
		

		
		//ordenar una lista ascendentemente
		Collections.sort(lista);
		System.out.println(lista);
		
		//ordenar una lista ascendentemente
		Collections.sort(lista, Collections.reverseOrder());
		System.out.println(lista);

	}
}
