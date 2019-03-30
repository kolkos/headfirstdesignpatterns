package headfirstdesignpatterns.chapter1;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Fly away! (FlyWithWings -> FlyBehavior)");
		
	}

}
