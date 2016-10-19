package controller;
public class ClockView extends ClockState {

	@Override
	public ClockState clickButtonOne() {
		return new ClockChangeHour();
	}

	@Override
	public ClockState clickButtonTwo() {
		return null;
	}

	@Override
	public Status status() {
		return Status.View;
	}

}
