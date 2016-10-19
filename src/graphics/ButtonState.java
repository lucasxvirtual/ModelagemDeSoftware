package graphics;

public abstract class ButtonState {

	protected static ButtonA buttonA;
	protected static ButtonB buttonB;
	
	public static ButtonState getButtonState(ButtonTemplate buttonTemplate){
		if(buttonTemplate instanceof ButtonA){
			buttonA = (ButtonA)buttonTemplate;
		} else {
			buttonB = (ButtonB)buttonTemplate;
		}
		
		return new ButtonReleased(buttonTemplate);
	}
	
	public abstract ButtonState actionOccur();
	
}
