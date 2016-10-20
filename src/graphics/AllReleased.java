package graphics;

import javax.swing.JButton;

public class AllReleased extends ButtonState{

	@Override
	public ButtonState buttonPressed(ButtonTemplate button) {
//		System.out.println("botao " + button.getText() + " pressionado > ALLRELEASED - ONEPRESSED");
		map.put(button.getText(), true);
		button.pressed();
		return new OnePressed();
	}

}
