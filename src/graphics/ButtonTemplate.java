package graphics;

import javax.swing.JButton;;

public abstract class ButtonTemplate extends JButton {
	
	protected boolean status;
	
	public ButtonTemplate(String s){
		super(s);
	}
	
	public void setStatus(Boolean status){
		this.status = status;
	}
	
	public boolean getStatus(){
		return status;
	}
	
	protected ButtonState state;
	
	public abstract void buttonAction();

}
