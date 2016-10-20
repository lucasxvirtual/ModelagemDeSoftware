package graphics;

import java.awt.Color;

public class DigitalMinute extends DigitalState{

	public DigitalMinute(){
		digitalPanel.changeMinuteLabelColor(Color.RED);
	}
	
	@Override
	public DigitalState statusChanged() {
		digitalPanel.changeMinuteLabelColor(Color.BLACK);
		return new DigitalView();
	}

}
