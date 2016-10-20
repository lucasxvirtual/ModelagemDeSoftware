package graphics;

import java.awt.Color;

import controller.Controller;

public class ButtonA extends ButtonTemplate{
	
	public ButtonA(String s){
		this.setText(s);
		this.setBackground(Color.GRAY);
	}

	@Override
	public void pressed() {
		this.setBackground(Color.CYAN);
	}

	@Override
	public void released() {
		Controller.getInstance().buttonPressed('A');
		this.setBackground(Color.GRAY);
	}

}
