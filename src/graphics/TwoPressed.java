package graphics;

public class TwoPressed extends ButtonState {

	@Override
	public ButtonState buttonPressed(ButtonTemplate button) {
//		System.out.println("botao " + button.getText() + " solto > TWOPRESSED - ONEPRESSED");
		map.put(button.getText(), false);
		button.falseRelease();
		return new OnePressed();
	}

}
