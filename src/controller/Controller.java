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
	
	private int decSecond = 0;
	private List<Observer> lst = new ArrayList<Observer>();
	private static Controller inst;

	private Controller(){
		
		Clock.getInstance().add(this);
		
		ActionListener changeClock = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				decSecond++;
				if(decSecond == 10){
					decSecond = 0;
					Clock.getInstance().incMinute();
				}
				
			}
        };
        Timer timer = new Timer(100,changeClock);
        timer.start();
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
	public int get(int i) {
		return Clock.getInstance().get(i);
	}
	
	
}
