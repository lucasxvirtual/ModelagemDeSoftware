package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import controller.Status;
import interfaces.Observed;
import interfaces.Observed.Get;
import interfaces.Observer;

public class DigitalPanel extends JPanel implements Observer {

	private JLabel hours = new JLabel();
	private JLabel divisor = new JLabel(":");
	private JLabel minutes = new JLabel();
	private Controller controller;
	private Status status;
	private DigitalState digitalState;
	
	public DigitalPanel(){
		controller = Controller.getInstance();
		controller.add(this);
		status = controller.getStatus();
		digitalState = DigitalState.getState(this);
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		hours.setText(String.format("%02d", controller.get(Get.Hour)));
		minutes.setText(String.format("%02d", controller.get(Get.Minute)));
		
		super.paintComponent(g);
		hours.setFont(new Font("Arial", Font.BOLD, 80));
		divisor.setFont(new Font("Arial", Font.BOLD, 80));
		minutes.setFont(new Font("Arial", Font.BOLD, 80));
		this.add(hours).setBounds(5, 5, 90, 90);
		this.add(divisor).setBounds(100, 5, 90, 90);
		this.add(minutes).setBounds(130, 5, 90, 90);
	}
	@Override
	public void notify(Observed o) {
//		System.out.println(status + " : " + controller.getStatus());
		if(status != controller.getStatus()){
			status = controller.getStatus();
			digitalState = digitalState.statusChanged();
		}
		repaint();
	}
	
	public void changeHourLabelColor(Color color){
		hours.setForeground(color);
	}
	
	public void changeMinuteLabelColor(Color color){
		minutes.setForeground(color);
	}
}
