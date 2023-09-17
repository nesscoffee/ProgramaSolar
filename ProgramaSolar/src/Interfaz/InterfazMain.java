package Interfaz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InterfazMain {
	
	public static void main(String[] args) {
		InterfazMain interfaz = new InterfazMain();
		interfaz.desplegarInterfaz();
	}

	JButton[] botones;
	boolean[] habilitados;
	
 	public void desplegarInterfaz() {
		JFrame frame = new JFrame("Modulo de configuración");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel(new FlowLayout());
		
		ImageIcon img = new ImageIcon("./assets/icon.png");
		frame.setIconImage(img.getImage());
		
		int numeroPaneles = 8;
		botones = new JButton[numeroPaneles];
		habilitados = new boolean[numeroPaneles];
		
		for (int i = 0; i < numeroPaneles; i++) {
			JLabel label = new JLabel("Panel " + (i + 1) + " (Capacidad: 24V)");
			panel.add(label);
			
			botones[i] = new JButton("Deshabilitar");
			final int index = i;
			botones[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					habilitados[index] = !habilitados[index];
					// Esto invierte la habilitacion, de true a false y viceversa.
					if(habilitados[index]) {
						botones[index].setText("Deshabilitar");
					} else {
						botones[index].setText("Habilitar");
					}
				}
			});
			panel.add(botones[i]);
		}
		
		JButton botonMonitor = new JButton("Ventana Monitor");
		botonMonitor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazMonitor ventanaMonitor = new InterfazMonitor();
			}
		});
		panel.add(botonMonitor);
		
		JButton botonCargarBateria = new JButton("Cargar bateria");
		panel.add(botonCargarBateria);
		
		frame.add(panel);
		frame.setVisible(true);
	}

}
