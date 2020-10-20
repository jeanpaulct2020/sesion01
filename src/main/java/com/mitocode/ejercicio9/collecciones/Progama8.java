package com.mitocode.ejercicio9.collecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Progama8 {

	public static void main(String[] args) {
		Map<String, String> paises = new HashMap<String,String>();
		
		paises.put("PE", "Peru");
		paises.put("CH", "Chile");
		paises.put("CO", "Colombia");
		paises.put("EC", "Ecuador");
		
		//validar si mapa esta vacio
		System.out.println("Map vacio: " + paises.isEmpty());
		
		//obtener valores
		Collection<String> valores = paises.values();
		System.out.println("Valores: " + valores);
		//obtener valores
		Collection<String> claves = paises.keySet();
		System.out.println("Claves: " + claves);
		
		//obtener un valor
		System.out.println("Valor: " + paises.get("CH"));
		
		//eliminar un elemento
		paises.remove("CO");
		System.out.println("Sin colombia: " + paises);
		
		//elimianr todos
		paises.clear();
		
		for (String p : paises.values()) {
			System.out.println("Pais: " + p);
		}
		
	}
}
