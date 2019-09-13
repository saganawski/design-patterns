package StratergyPattern.model;

import StratergyPattern.Interface.FlyBehavior.FlyWithWings;
import StratergyPattern.Interface.QuackBehavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("I'm a mallard duck!");

	}

}
