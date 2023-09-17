package Interfaz;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterfazMonitor {
	public InterfazMonitor() {
		JFrame frame = new JFrame("Modulo de monitoreo");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		
		ImageIcon img = new ImageIcon("./assets/icon.png");
		frame.setIconImage(img.getImage());
		
		JPanel panel = new JPanel(new BorderLayout());
		
		JPanel panelHora = new JPanel(new BorderLayout());
		JLabel labelHora = new JLabel();
		panelHora.add(labelHora);
		panel.add(panelHora, BorderLayout.NORTH);
		
		JPanel panelGenerando = new JPanel();
		panelGenerando.setLayout(new BoxLayout(panelGenerando, BoxLayout.Y_AXIS));
		panel.add(panelGenerando);
		
		List<Object> progressBars = new ArrayList<>();
		
		int cantidadPaneles = 5;
		for (int i = 1; i <= cantidadPaneles; i++) {
			JPanel panel2 = new JPanel();
			panel.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			JLabel labelPanel = new JLabel("Panel " + (i + 1) +" (23V/24V) :");
			panel2.add(labelPanel);
			
			JProgressBar progressBar = new JProgressBar(0, 24);
			progressBar.setValue(23);
			progressBar.setStringPainted(true);
			panel2.add(progressBar);
			
			progressBars.add(progressBar);
			panelGenerando.add(panel2);
		}
		
		Timer timer = new Timer(100, e -> {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String horaActual = sdf.format(new Date());
			labelHora.setText("Hora Actual: " + horaActual);
		});
		timer.start();
		
		JPanel panelBateria = new JPanel();
		panelBateria.setLayout(new BoxLayout(panelBateria, BoxLayout.Y_AXIS));
		panel.add(panelBateria);
		
		boolean cargando = false;
		
		JLabel bateria = new JLabel("Bateria:");
		panelBateria.add(bateria);
		
		JLabel bateriaCapacidad = new JLabel("Capacidad: 70%");
		panelBateria.add(bateriaCapacidad);
		
		JLabel bateriaCargando = new JLabel("Cargando: " + (cargando ? "Si" : "No"));
		panelBateria.add(bateriaCargando);
		
		frame.add(panel);
		frame.setVisible(true);
	}
}
