package headfirstdesignpatterns.chapter4.pizzas;

import headfirstdesignpatterns.chapter4.pizzas.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
