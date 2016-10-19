package graphics;

import javax.swing.JFrame;

public class DigitalFrame extends JFrame {
	
	DigitalPanel digitalPanel;

	public DigitalFrame(){
		digitalPanel = new DigitalPanel();
		this.add(digitalPanel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(240, 140);
	}
}
