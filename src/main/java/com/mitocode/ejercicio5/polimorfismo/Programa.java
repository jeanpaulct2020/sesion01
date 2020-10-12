package com.mitocode.ejercicio5.polimorfismo;

public class Programa {

	public static void main(String[] args) {

		//Cuenta cuenta1 = new Cuenta("10", "Dany", 0.0);
//		System.out.println(cuenta1);
//		
//		Cuenta cuenta2 = new CuentaNegocio("11", "Dany 2", 100.0, 500.0);
//		System.out.println(cuenta2);

//		No se debe de hacer
//		CuentaNegocio cuenta3 = new Cuenta();

		// Asignaci�n ordinaria
//		CuentaNegocio cuentaNegocio = new CuentaNegocio("12", "Dany 3", 0.0, 500.0);
//		System.out.println(cuentaNegocio);
//		Cuenta cuenta4 = cuentaNegocio;
//		System.out.println(cuenta4);

		//Cuenta cuenta5 = new CuentaNegocio("13", "Dany 4", 0.0, 200.0);
		Cuenta cuenta6 = new CuentaNegocio("14", "Dany 5", 500.0, 1000.0);
		System.out.println(cuenta6);

		// DOWNCASTING

//		System.out.println(cuenta6.getClass());

		if (cuenta6 instanceof CuentaNegocio) {
			CuentaNegocio cuenta7 = (CuentaNegocio) cuenta6;
			cuenta7.prestamo(150);
			System.out.println(cuenta7);
		}

//		Crear una cuenta de ahorros y probar sus operaciones
		CuentaAhorros cuenta8 = new CuentaAhorros("15", "Dany 6", 1000, 0.05);
		System.out.println(cuenta8);

		System.out.println("Retiro: " + 50);
		cuenta8.retiro(50);
		System.out.println(cuenta8);

		System.out.println("Deposito: " + 150);
		cuenta8.deposito(150);
		System.out.println(cuenta8);

		System.out.println("Interes ganado: " + 0.05);
		cuenta8.actualizarSaldo();
		System.out.println(cuenta8);

	}
	


}
