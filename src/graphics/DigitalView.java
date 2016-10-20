package graphics;

public class DigitalView extends DigitalState {

	@Override
	public DigitalState statusChanged() {
		return new DigitalHour();
	}

}
