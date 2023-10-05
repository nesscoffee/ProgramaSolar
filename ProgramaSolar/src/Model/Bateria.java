package model;

public class Bateria {
	
	private int porcentajeCarga;
	private boolean cargando;
	
	public boolean cargada() {
		return porcentajeCarga == 100;
	}
	
	public int getPorcentajeCarga() {
		return this.porcentajeCarga;
	}
	
	public void agregarCarga(int aumento) {
		this.porcentajeCarga = this.porcentajeCarga + aumento;
	}
	
	public void agregarCarga() {
		this.porcentajeCarga = this.porcentajeCarga + 1;
	}
	
	public void disminuirCarga(int decremento) {
		this.porcentajeCarga = this.porcentajeCarga - decremento;
	}
	
	public void disminuirCarga() {
		this.porcentajeCarga = this.porcentajeCarga - 1;
	}

}
