package com.mitocode.ejercicio9.collecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programa7 {

	public static void main(String[] args) {
		Character[] letras = {'P','C','M'};
		
		List<Character> lista = Arrays.asList(letras);
		
		System.out.println("Lista: ");
		imprimir(lista);
		
		//Invertir elementos
		Collections.reverse(lista);
		System.out.println("Lista invertida: ");
		imprimir(lista);
		
		//copiar lista
		int tamanio = lista.size();
		Character[] listaCopia = new Character[tamanio];
		List<Character> copiaLista = Arrays.asList(listaCopia);
		
		System.out.println("Lista copiada: ");
		Collections.copy(copiaLista, lista);
		imprimir(copiaLista);
		
		//fill
		Collections.fill(lista, 'R');
		System.out.println("Lista llena de R:");
		imprimir(lista);
		
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(1000);
		numeros.add(40);
		numeros.add(30);
		
		//maximo y minimo de un collections
		System.out.println("Valor maximo y minimo: ");
		System.out.println("Max: " + Collections.max(numeros));
		System.out.println("Min: " + Collections.min(numeros));
		
		
		//unir lista
		List<Character> listaExtend = new ArrayList<>();
		listaExtend.add('A');
		listaExtend.add('B');
		listaExtend.add('C');
		Collections.addAll(listaExtend, letras);
		System.out.println("lista extend: ");
		imprimir(listaExtend);
	}
	
	public static void imprimir(List<Character> lista) {
		for (Character character : lista) {
			System.out.print(character  + " ");
		}
		System.out.println();
	}
}
