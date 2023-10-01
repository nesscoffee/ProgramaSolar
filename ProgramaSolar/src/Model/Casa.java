package Model;

import java.util.ArrayList;

public class Casa {
	
	private ArrayList<PanelSolar> panelesSolares;
	private Bateria bateria;
	private int consumo;
	
	public void agregarPanel(PanelSolar panel) {
		panelesSolares.add(panel);
	}
	
	public void removerPanel(PanelSolar panel) {
		panelesSolares.remove(panel);
	}

}
