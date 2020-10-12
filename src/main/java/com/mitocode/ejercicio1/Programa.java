package com.mitocode.ejercicio1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		//capturar valores de la consola
		Scanner sc = new Scanner(System.in);
		
		//Creando una instancia de cuenta
		Cuenta cuenta;
		
		System.out.println("Ingrese el numero de cuenta: ");
		String numeroCuenta = sc.nextLine();
		
		System.out.println("Ingrese el titular de la cuenta: ");
		String titular = sc.nextLine();
		
		System.out.println("¿Desea Realizar un deposito inicial (y/n)? ");
		char rpta = sc.nextLine().charAt(0);
		
		if(rpta == 'y' ) {
			System.out.println("Ingrese el monto inicial: ");
			double monto = sc.nextDouble();
			cuenta = new Cuenta(numeroCuenta, titular, monto);
			
		}else {
			cuenta = new Cuenta(numeroCuenta, titular);
		}
		
		System.out.println("Datos de la cuenta: ");
		System.out.println(cuenta.toString());
		
		//deposito
		System.out.println("Ingrese el valor de deposito: ");
		double monto = sc.nextDouble();
		cuenta.deposito(monto);
		
		System.out.println("Datos de la cuenta: ");
		System.out.println(cuenta.toString());
		
		//retiro
		System.out.println("Ingrese el valor de retiro: ");
		double montoRetiro = sc.nextDouble();
		cuenta.retiro(montoRetiro);
		
		System.out.println("Datos de la cuenta: ");
		System.out.println(cuenta.toString());
		
		//cuenta.setNumeroCuenta(numeroCuenta);
		sc.close();
	}
}
