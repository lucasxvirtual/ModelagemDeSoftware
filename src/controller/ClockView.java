package controller;
public class ClockView extends ClockState {
	
	public ClockView(){
		if(!clock.isTimerRunning())
			clock.startTimer();
	}

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
