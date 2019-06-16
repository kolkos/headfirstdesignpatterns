package headfirstdesignpatterns.chapter4;

import headfirstdesignpatterns.chapter4.pizzas.Pizza;
import headfirstdesignpatterns.chapter4.stores.NYPizzaStore;
import headfirstdesignpatterns.chapter4.stores.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

    }
}
