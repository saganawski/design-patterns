package DecoratorPattern.Decorator;

import DecoratorPattern.Beverages.Beverage;

public class Soy extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

}
