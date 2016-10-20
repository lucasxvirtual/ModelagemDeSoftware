package graphics;

public abstract class DigitalState {
	
	protected static DigitalPanel digitalPanel;

	public static DigitalState getState(DigitalPanel _digitalPanel){
		digitalPanel = _digitalPanel;
		return new DigitalView();
	}
	
	public abstract DigitalState statusChanged();
	
}
