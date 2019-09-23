package DecoratorPattern;

import DecoratorPattern.Beverages.Beverage;
import DecoratorPattern.Beverages.Expresso;
import DecoratorPattern.Beverages.HouseBlend;
import DecoratorPattern.Decorator.Mocha;
import DecoratorPattern.Decorator.Soy;
import DecoratorPattern.Decorator.Whip;

public class CoffeShop {

	public static void main(String[] args) {
		Beverage houseBlend = new HouseBlend();
		
		//checkout base price
		System.out.println(houseBlend.getDescription() + " Cost:" + houseBlend.cost());
		
		//add decorators
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		
		System.out.println("House blend after decorators");
		System.out.println(houseBlend.getDescription() + " Cost:" + houseBlend.cost());
		
		// try another beverage
		
		Beverage expresso = new Expresso();
		
		//checkout base price
		System.out.println(expresso.getDescription() + " Cost:" + expresso.cost());
		
		//add decorators
		expresso = new Soy(expresso);
		expresso = new Mocha(expresso);
		expresso = new Whip(expresso);
		
		System.out.println("expresso after decorators");
		System.out.println(expresso.getDescription() + " Cost:" + expresso.cost());

	}

}
