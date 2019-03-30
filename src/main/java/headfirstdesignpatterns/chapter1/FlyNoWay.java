package headfirstdesignpatterns.chapter1;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I cannot fly! (FlyNoWay -> FlyBehavior)");
		
	}

}
