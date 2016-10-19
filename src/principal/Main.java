package principal;

import graphics.*;

public class Main {

	public static void main(String[] args) {

		ButtonFrame buttonFrame = new ButtonFrame();
		buttonFrame.setSize(480, 180);
		buttonFrame.setLocation(0, 500);
		buttonFrame.setVisible(true);
		AnalogFrame analogFrame = new AnalogFrame();
		analogFrame.setLocation(0, 0);
		analogFrame.setVisible(true);
		DigitalFrame digitalFrame = new DigitalFrame();
		digitalFrame.setLocation(470, 0);
		digitalFrame.setVisible(true);
	}

}
