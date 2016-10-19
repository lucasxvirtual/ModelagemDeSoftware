package graphics;

import javax.swing.JFrame;

public class AnalogFrame extends JFrame{
	
	private AnalogPanel analogPanel;
	
	public AnalogFrame(){
		analogPanel = new AnalogPanel();
		this.add(analogPanel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(470, 500);
	}

}
