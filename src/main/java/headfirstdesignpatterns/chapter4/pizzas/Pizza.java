package headfirstdesignpatterns.chapter4.pizzas;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough....");
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings: ");
        toppings.forEach(System.out::println);

    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza in diagonal slices");
    }

    public void box() {
        System.out.println("Place the pizza in the box");
    }

    public String getName() {
        return name;
    }
}
