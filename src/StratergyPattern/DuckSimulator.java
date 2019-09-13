package StratergyPattern;

import StratergyPattern.Interface.FlyBehavior.FlyRocketPower;
import StratergyPattern.Interface.QuackBehavior.Squeak;
import StratergyPattern.model.Duck;
import StratergyPattern.model.MallardDuck;
import StratergyPattern.model.RedHeadDuck;
import StratergyPattern.model.RubberDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		System.out.println("Initialize Duck program!");
		
		final Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();;
		mallard.performQuack();
		
		System.out.println("\n");
		System.out.println("Rubber ducky is next");
			
		final Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.performQuack();
		rubberDuck.performFly();
		
		System.out.println("\n");
		System.out.println("Redhead duck is next. This duck will update fly behavior at run time");
		
		final Duck redHeadDuck = new RedHeadDuck();
		redHeadDuck.display();
		redHeadDuck.performQuack();
		redHeadDuck.performFly();
		System.out.println("Now Change behaviors.");
		redHeadDuck.setFlyBehavior(new FlyRocketPower());
		redHeadDuck.performFly();
		redHeadDuck.setQuackBehavior(new Squeak());
		redHeadDuck.performQuack();
		

	}

}