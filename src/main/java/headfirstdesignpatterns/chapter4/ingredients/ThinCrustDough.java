package headfirstdesignpatterns.chapter4.ingredients;

public class ThinCrustDough implements Dough {
    private final String name;

    public ThinCrustDough() {
        name = "Thin Crust Dough";
    }

    @Override
    public String getName() {
        return name;
    }
}
