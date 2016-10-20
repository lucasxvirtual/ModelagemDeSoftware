package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.Timer;

import interfaces.Observed;
import interfaces.Observer;

public class Controller implements Observed, Observer{
	
	private List<Observer> lst = new ArrayList<Observer>();
	private static Controller inst;
	private static Clock clock;

	private Controller(){
		clock = Clock.getInstance();
		clock.add(this);

	}
	
	public static Controller getInstance(){
		if(inst == null)
			inst = new Controller();
		return inst;
	}

	@Override
	public void notify(Observed o) {
		ListIterator<Observer> li = lst.listIterator();
		while(li.hasNext())
			li.next().notify(this);
	}

	@Override
	public void add(Observer o) {
		lst.add(o);
	}

	@Override
	public int get(Get i) {
		return clock.get(i);
	}
	
	public void buttonPressed(char c){
		if(c == 'A')
			clock.clickButtonOne();
		else clock.clickButtonTwo();
	}

	@Override
	public Status getStatus() {
		return clock.getStatus();
	}
	
}
