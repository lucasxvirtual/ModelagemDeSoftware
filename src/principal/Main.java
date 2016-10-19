package principal;

import graphics.*;

public class Main {
	
	private static ButtonFrame buttonFrame;
	private static AnalogFrame analogFrame;
	private static DigitalFrame digitalFrame;

	public static void main(String[] args) {

		buttonFrame = new ButtonFrame();
		buttonFrame.setSize(480, 180);
		buttonFrame.setLocation(0, 500);
		buttonFrame.setVisible(true);
		analogFrame = new AnalogFrame();
		analogFrame.setLocation(0, 0);
		analogFrame.setVisible(true);
		digitalFrame = new DigitalFrame();
		digitalFrame.setLocation(470, 0);
		digitalFrame.setVisible(true);
	}

}
