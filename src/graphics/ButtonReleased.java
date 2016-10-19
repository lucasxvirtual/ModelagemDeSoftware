package graphics;

import java.awt.Color;

public class ButtonReleased extends ButtonState {

	public ButtonReleased(ButtonTemplate buttonTemplate) {
		buttonTemplate.setBackground(Color.GRAY);
		buttonTemplate.setStatus(false);
	}

	@Override
	public ButtonState actionOccur() {
		//TODO decidir como sera feita a transicao de estados
		//return new ButtonPressed();
		return null;
	}

}
