package graphics;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ButtonPanel extends JPanel implements ActionListener{
	private ButtonA buttonA = new ButtonA("A");
	private ButtonB buttonB = new ButtonB("B");
	private ButtonState state;
	public ButtonPanel(){
		buttonA.addActionListener(this);
		buttonB.addActionListener(this);
		state = ButtonState.getState();
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.add(buttonA).setBounds(20, 20, 200, 100);
		this.add(buttonB).setBounds(240, 20, 200, 100);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		state = state.buttonPressed((ButtonTemplate)arg0.getSource());
	}
}

