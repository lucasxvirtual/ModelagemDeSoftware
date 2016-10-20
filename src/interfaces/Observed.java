package interfaces;

import controller.Status;

public interface Observed {
	
	public enum Get{
		Hour, Minute, Second;
	}
	
	void add(Observer o);
	int get(Get i);
	Status getStatus();
}
