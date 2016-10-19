package graphics;

import javax.swing.JFrame;

public class ButtonFrame extends JFrame{
	
	ButtonPanel buttonPanel;
	
	public ButtonFrame(){
		buttonPanel = new ButtonPanel();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(buttonPanel);
	}

}
