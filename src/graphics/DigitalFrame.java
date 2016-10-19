package graphics;

import javax.swing.JFrame;

public class DigitalFrame extends JFrame {

	public DigitalFrame(){
		this.add(new DigitalPanel());
		this.setSize(240, 140);
	}
}
