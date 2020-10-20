package com.mitocode.ejercicio8.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Ingrese un numerador:");
		int numerador = sc.nextInt();
		System.out.print("Ingrese un denominador:");
		int denominador = sc.nextInt();
		
//		try {
//			System.out.print("Ingrese un denominador:");
//			int denominador = sc.nextInt();
//			
//			int resultado =  dividir(numerador,denominador);
//			System.out.println("Resultado: " + resultado);
//		} catch (ArithmeticException e) {
//			System.out.println("Cero es denominador invalido.");
//		}catch(InputMismatchException i) {
//			System.out.println("El denominador tiene un formato incorrecto");
//		}finally {
//			System.out.println("Se ejecuta siempre");
//		}
		
		//forma2
//		int resultado =  dividir(numerador,denominador);
//		System.out.println("Resultado: " + resultado);

		
		//forma3 usando throw
		
		try {
			int resultado =  dividir2(numerador,denominador);
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Denonimador formato Incorrecto");
		}
		
		
		sc.close();
	}
	
	public static int dividir(int numerador, int denominador) {
		try {
			return numerador/denominador;
		} catch (Exception e) {
			System.out.println("Cero es denominador invalido.");
			return -1;
		} finally {
			System.out.println("finally siempre");
		}
		
	}
	
	public static int dividir2(int numerador, int denominador) throws ArithmeticException{
		return numerador/denominador;
	}
}
