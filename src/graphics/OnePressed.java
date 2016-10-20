package graphics;

import javax.swing.JButton;

public class OnePressed extends ButtonState{

	@Override
	public ButtonState buttonPressed(ButtonTemplate button) {
		if(map.get(button.getText())){
			button.released();
			return new AllReleased();
		}
		button.pressed();
		return new TwoPressed();
	}

}
