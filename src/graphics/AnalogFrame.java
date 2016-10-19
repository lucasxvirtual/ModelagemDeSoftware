package graphics;

import javax.swing.JFrame;

public class AnalogFrame extends JFrame{
	
	public AnalogFrame(){
		this.add(new AnalogPanel());
		this.setSize(470, 500);
	}

}
