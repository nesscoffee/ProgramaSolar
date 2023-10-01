package Model;

public class PanelSolar {
	
	private int cantidadCeldas;
	private int cantidadVoltios;
	private boolean encendido;
	
	public void encender() {
		this.encendido = true;
	}
	
	public void apagar() {
		this.encendido = false;
	}
	
	public int getCeldas() {
		return cantidadCeldas;
	}
	
	public int getVoltios() {
		return cantidadVoltios;
	}
	
}
