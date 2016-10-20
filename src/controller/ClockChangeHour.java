package controller;
public class ClockChangeHour extends ClockState {
	
	public ClockChangeHour(){
		if(clock.isTimerRunning())
			clock.stopTimer();
	}

	@Override
	public ClockState clickButtonOne() {
		return new ClockChangeMinute();
	}

	@Override
	public ClockState clickButtonTwo() {
		clock.incHour();
		return null;
	}

	@Override
	public Status status() {
		return Status.ChangeHour;
	}

}
