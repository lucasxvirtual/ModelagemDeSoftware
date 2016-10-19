package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import interfaces.Observed;
import interfaces.Observer;

public class Clock implements Observed {
	
	private int hour;
	private int minute;
	private ClockState clockState;
	private static Clock inst;
	private List<Observer> lst = new ArrayList<Observer>();
	
	private Clock(int hour, int minute){
		clockState = ClockState.getInitialState(this);
		this.hour = hour;
		this.minute = minute;
	}
	
	public static Clock getInstance(){
		if(inst == null)
			inst = new Clock(15, 00);
		return inst;
	}
	
	public void incHour(){
		hour++;
		if(hour > 23)
			hour = 0;
	}
	
	public void incMinute(){
		minute++;
		if(minute > 59){
			minute = 0;
			this.incHour();
		}
		
		ListIterator<Observer> li = lst.listIterator();
		while(li.hasNext())
			li.next().notify(this);
	}
	
	public void clickButtonOne(){
		ClockState temp = clockState.clickButtonOne();
		if(temp != null)
			clockState = temp;
		
		ListIterator<Observer> li = lst.listIterator();
		while(li.hasNext())
			li.next().notify(this);
	}
	
	public void clickButtonTwo(){
		ClockState temp = clockState.clickButtonTwo();
		if(temp != null)
			clockState = temp;
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}

	@Override
	public void add(Observer o) {
		lst.add(o);
	}

	@Override
	public int get(int i) {
		if(i == 1)
			return this.getHour();
		else
			return this.getMinute();
	}

}
