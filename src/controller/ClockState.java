package controller;
public abstract class ClockState {
	
	//TODO: substituir por Clock
	protected static Clock clock;
	
	public static ClockState getInitialState(Clock c){
		clock = c;
		return new ClockView();
	}
	
	public abstract ClockState clickButtonOne();
	public abstract ClockState clickButtonTwo();
	public abstract Status status();

}
