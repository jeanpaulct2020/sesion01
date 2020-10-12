package com.mitocode.ejercicio2.staticos;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cual es el precio del dólar? ");
		double precioDolar = sc.nextDouble();
		
		System.out.println("¿Cuantos dolares se compraran?");
		double monto = sc.nextDouble();
		
		//ConvertidorMoneda c = new ConvertidorMoneda();
		//double resultado = c.dolarToNuevoSol(monto, precioDolar);
		double resultado = ConvertidorMoneda.dolarToNuevoSol(monto, precioDolar);
		System.out.println("Monto a pagar en soles: " + resultado);
		
		sc.close();
		
	}
}
