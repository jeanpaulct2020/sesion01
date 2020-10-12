package com.mitocode.ejercicio4.modificadores;


public class Programa {

	public static void main(String[] args) {
		

		CuentaNegocio cuentaNegocio = new CuentaNegocio("10", "Jean", 150.0,500.0);
		System.out.println(cuentaNegocio);
		
		double monto = 100.0;
		cuentaNegocio.prestamo(monto);
		
		System.out.println(cuentaNegocio);
	}
}
