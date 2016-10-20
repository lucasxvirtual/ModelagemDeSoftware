package graphics;

import java.awt.Color;

import controller.Controller;

public class ButtonB extends ButtonTemplate{

	public ButtonB(String s){
		this.setText(s);
		this.setBackground(Color.GRAY);
	}
	
	@Override
	public void pressed() {
		this.setBackground(Color.CYAN);
	}

	@Override
	public void released() {
		Controller.getInstance().buttonPressed('B');
		this.setBackground(Color.GRAY);
	}

}
