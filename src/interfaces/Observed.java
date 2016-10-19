package interfaces;

public interface Observed {
	
	public enum Get{
		Hour, Minute, Second;
	}
	
	void add(Observer o);
	int get(Get i);
}
