package controller;
public abstract class ClockState {
	
	//TODO: substituir por Clock
	protected static Clock clock;
	
	public static ClockState getInitialState(Clock _clock){
		clock = _clock;
		return new ClockView();
	}
	
	public abstract ClockState clickButtonOne();
	public abstract ClockState clickButtonTwo();
	public abstract Status status();

}
