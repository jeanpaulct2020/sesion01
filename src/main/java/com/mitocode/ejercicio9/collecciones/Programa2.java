package com.mitocode.ejercicio9.collecciones;

import java.util.List;

import com.mitocode.ejercicio6.enums.Cuenta;
import com.mitocode.ejercicio6.enums.CuentaAhorros;

import java.util.ArrayList;
import java.util.Iterator;

public class Programa2 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		
		//Recorrer la lista de tipo Array list
		System.out.println("Estructura foreach: ");
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		
		System.out.println("Estructura iterator: ");
		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<CuentaAhorros> listaCuenta = new ArrayList<>();
		
		CuentaAhorros c1 = new CuentaAhorros();
		
		c1.setNumeroCuenta("10");
		c1.setTitular("Jean");
		c1.setSaldo(1200);
		
		
		CuentaAhorros c2 = new CuentaAhorros();
		
		c2.setNumeroCuenta("20");
		c2.setTitular("Dany");
		c2.setSaldo(1450);
		
		CuentaAhorros c3 = new CuentaAhorros();
		
		c3.setNumeroCuenta("30");
		c3.setTitular("Juan");
		c3.setSaldo(1205);
		
		listaCuenta.add(c1);
		listaCuenta.add(c2);
		listaCuenta.add(c3);
		
		for (CuentaAhorros cuenta : listaCuenta) {
			System.out.println(cuenta);
		}
		
		
	}
}
