package DecoratorPattern.Decorator;

import DecoratorPattern.Beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
