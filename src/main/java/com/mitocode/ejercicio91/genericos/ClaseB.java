package com.mitocode.ejercicio91.genericos;

public class ClaseB<K, T, V, E> {

	private K objetoK;
	private T objetoT;
	private V objetoV;
	private E objetoE;

	public ClaseB() {
		super();
	}

	public ClaseB(K objetoK, T objetoT, V objetoV, E objetoE) {
		super();
		this.objetoK = objetoK;
		this.objetoT = objetoT;
		this.objetoV = objetoV;
		this.objetoE = objetoE;
	}

	public K getObjetoK() {
		return objetoK;
	}

	public void setObjetoK(K objetoK) {
		this.objetoK = objetoK;
	}

	public T getObjetoT() {
		return objetoT;
	}

	public void setObjetoT(T objetoT) {
		this.objetoT = objetoT;
	}

	public V getObjetoV() {
		return objetoV;
	}

	public void setObjetoV(V objetoV) {
		this.objetoV = objetoV;
	}

	public E getObjetoE() {
		return objetoE;
	}

	public void setObjetoE(E objetoE) {
		this.objetoE = objetoE;
	}

	public void mostrarTipo() {
		System.out.println("K es una clase: " + objetoK.getClass());
		System.out.println("T es una clase: " + objetoT.getClass());
		System.out.println("V es una clase: " + objetoV.getClass());
		System.out.println("E es una clase: " + objetoE.getClass());
	}

}
