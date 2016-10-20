package graphics;

import java.awt.Color;

public class DigitalHour extends DigitalState{
	
	public DigitalHour(){
		digitalPanel.changeHourLabelColor(Color.RED);
	}

	@Override
	public DigitalState statusChanged() {
		digitalPanel.changeHourLabelColor(Color.BLACK);
		return new DigitalMinute();
	}

}
