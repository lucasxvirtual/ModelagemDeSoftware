package graphics;

import java.awt.Color;

public class ButtonPressed extends ButtonState {
	
	public ButtonPressed(ButtonTemplate buttonTemplate){
		buttonTemplate.setBackground(Color.CYAN);
		buttonTemplate.setStatus(true);
	}

	@Override
	public ButtonState actionOccur() {
		//TODO decidir como sera feita a transicao de estados
		//return new ButtonReleased();
		return null;
	}

}
