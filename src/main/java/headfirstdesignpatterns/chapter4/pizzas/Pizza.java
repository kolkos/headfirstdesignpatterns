package headfirstdesignpatterns.chapter4.pizzas;

import headfirstdesignpatterns.chapter4.ingredients.*;

import java.util.Arrays;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(" -" + dough.getName());
            result.append("\n");
        }
        if (sauce != null) {
            result.append(" -" + sauce.getSauceName());
            result.append("\n");
        }
        if (cheese != null) {
            result.append(" -" + cheese.getCheeseName());
            result.append("\n");
        }
        if (veggies != null) {
            result.append(" -" + dough.getName());
            for (int i = 0; i < veggies.length; i++) {
                result.append(" -" + veggies[i].getVeggieName());
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(" -" + clam.getClamName());
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(" -" + pepperoni.getPepperoniName());
            result.append("\n");
        }
        return result.toString();
    }
}
