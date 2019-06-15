package headfirstdesignpatterns.chapter4.stores;

import headfirstdesignpatterns.chapter4.pizzas.NYStyleCheesePizza;
import headfirstdesignpatterns.chapter4.pizzas.NYStylePepperoniPizza;
import headfirstdesignpatterns.chapter4.pizzas.Pizza;
import headfirstdesignpatterns.chapter4.stores.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("pepperoni".equals(type)){
            pizza = new NYStylePepperoniPizza();
        }else if("cheese".equals(type)){
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}
