package headfirstdesignpatterns.chapter4.pizzas;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Sauce and Pepperoni Pizza";
        dough = "Thin crust dough";
        sauce = "Tomato Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Pepperoni");
    }
}
