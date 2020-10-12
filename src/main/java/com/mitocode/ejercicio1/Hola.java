package com.mitocode.ejercicio1;

import java.util.Scanner;

public class Hola {
	public static void main(String[] args) {
		//imprimir mensaje
		System.out.println("Bienvenido al curso 2021");
		
		//capturar valores de la consola
		Scanner sc = new Scanner(System.in);
				
		System.out.println("¿cuál es tu nombre?: ");
		
		String nombre = sc.nextLine();
		System.out.println("Bienvenido " + nombre);
		
		sc.close();
		
	}
}
