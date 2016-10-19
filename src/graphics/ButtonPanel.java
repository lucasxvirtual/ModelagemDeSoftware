package graphics;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ButtonPanel extends JPanel {
	private JButton digitalButton = new JButton("Ajustar horas");
	private JButton analogButton = new JButton("Ajustar minutos");
	public ButtonPanel(){
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.add(digitalButton).setBounds(20, 20, 200, 100);
		this.add(analogButton).setBounds(240, 20, 200, 100);
	}
}

