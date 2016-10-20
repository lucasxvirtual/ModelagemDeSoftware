package graphics;

public class TwoPressed extends ButtonState {

	@Override
	public ButtonState buttonPressed(ButtonTemplate button) {
		map.put(button.getText(), false);
		button.falseRelease();
		return new OnePressed();
	}

}
