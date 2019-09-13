package StratergyPattern.model;

import StratergyPattern.Interface.FlyBehavior.FlyNoWay;
import StratergyPattern.Interface.QuackBehavior.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("i'm a rubber duck!");

	}

}
