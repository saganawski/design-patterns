package DecoratorPattern.Decorator;

import DecoratorPattern.Beverages.Beverage;

public class Whip extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Whip Cream";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}

}
