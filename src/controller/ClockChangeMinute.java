package controller;
public class ClockChangeMinute extends ClockState {

	@Override
	public ClockState clickButtonOne() {
		return new ClockView();
	}

	@Override
	public ClockState clickButtonTwo() {
		clock.incMinute();
		return null;
	}

	@Override
	public Status status() {
		return Status.ChangeMinute;
	}	

}
