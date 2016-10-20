package graphics;

import javax.swing.JButton;

public class OnePressed extends ButtonState{

	@Override
	public ButtonState buttonPressed(ButtonTemplate button) {
		if(map.get(button.getText())){
//			System.out.println("botao " + button.getText() + " solto > ONEPRESSED - ALLRELEASED");
			map.put(button.getText(), false);
			button.released();
			return new AllReleased();
		}
//		System.out.println("botao " + button.getText() + " pressionado > ONEPRESSED - TWOPRESSED");
		map.put(button.getText(), true);
		button.pressed();
		return new TwoPressed();
	}

}
