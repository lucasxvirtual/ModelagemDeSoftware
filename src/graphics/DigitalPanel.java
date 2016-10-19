package graphics;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import interfaces.Observed;
import interfaces.Observer;

public class DigitalPanel extends JPanel implements Observer {

	JLabel horas = new JLabel();
	JLabel doisPontos = new JLabel(":");
	JLabel minutos = new JLabel();
	
	public DigitalPanel(){
		Controller.getInstance().add(this);
	}
	@Override
	public void paintComponent(Graphics g){
		
		horas.setText(String.format("%02d", Controller.getInstance().get(1)));
		minutos.setText(String.format("%02d", Controller.getInstance().get(2)));
		
		super.paintComponent(g);
		horas.setFont(new Font("Arial", Font.BOLD, 80));
		doisPontos.setFont(new Font("Arial", Font.BOLD, 80));
		minutos.setFont(new Font("Arial", Font.BOLD, 80));
		this.add(horas).setBounds(5, 5, 90, 90);
		this.add(doisPontos).setBounds(100, 5, 90, 90);
		this.add(minutos).setBounds(130, 5, 90, 90);
	}
	@Override
	public void notify(Observed o) {
		repaint();
	}
}
