package graphics;

import java.awt.Color;

import javax.swing.JButton;

public abstract class ButtonTemplate extends JButton{

	public abstract void pressed();
	
	public abstract void released();
	
	public void falseRelease(){
		this.setBackground(Color.GRAY);
	}
	
}
