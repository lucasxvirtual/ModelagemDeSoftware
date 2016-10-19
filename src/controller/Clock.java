package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.Timer;

import interfaces.Observed;
import interfaces.Observer;

public class Clock implements Observed {
	
	private int hour;
	private int minute;
	private int second = 0;
	private int decSecond = 0;
	private ClockState clockState;
	private static Clock inst;
	private List<Observer> lst = new ArrayList<Observer>();
	
	private Clock(int hour, int minute){
		clockState = ClockState.getInitialState(this);
		this.hour = hour;
		this.minute = minute;
		
		ActionListener changeClock = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				decSecond++;
				if(decSecond == 10){
					decSecond = 0;
					Clock.getInstance().incSecond();
				}
				
			}
        };
        Timer timer = new Timer(100,changeClock);
        timer.start();
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
	
	public void incSecond(){
		second++;
		if(second > 59){
			second = 0;
			this.incMinute();
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
	
	public int getSecond(){
		return second;
	}

	@Override
	public void add(Observer o) {
		lst.add(o);
	}

	@Override
	public int get(Get i) {
		if(i == Get.Hour)
			return this.getHour();
		else if(i == Get.Minute)
			return this.getMinute();
		else if (i == Get.Second)
			return this.getSecond();
		return 0;
	}

}
