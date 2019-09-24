package factoryMethodPattern.creator;

import factoryMethodPattern.product.NYStyleCheesePizza;
import factoryMethodPattern.product.Pizza;

public class NYpizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if(type.equalsIgnoreCase("cheese")) {
			return new NYStyleCheesePizza();
		}else {
			return null;			
		}
	}

}
