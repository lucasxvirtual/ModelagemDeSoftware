package graphics;

import java.util.HashMap;
import java.util.Map;

public abstract class ButtonState {

	protected static Map<String, Boolean> map = new HashMap<String, Boolean>();
	
	public static ButtonState getState(){
		map.put("A", false);
		map.put("B", false);
		
		return new AllReleased();
	}
	
	public abstract ButtonState buttonPressed(ButtonTemplate button);
	
}
