package StratergyPattern.model;

import StratergyPattern.Interface.FlyBehavior.FlyWithWings;
import StratergyPattern.Interface.QuackBehavior.Quack;

public class RedHeadDuck extends Duck {

	
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
		
	}

	@Override
	public void display() {
		System.out.println("RedHeadDuck");

	}

}
