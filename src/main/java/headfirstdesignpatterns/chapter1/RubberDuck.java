package headfirstdesignpatterns.chapter1;

public class RubberDuck extends Duck{
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public void display() {
		System.out.println("Look at me! I am a rubber duck!");
	}
}
