package headfirstdesignpatterns.chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsChapter1 {

	@Test
	void test() {
		MallardDuck mallardDuck = new MallardDuck();
		
		RubberDuck rubberDuck = new RubberDuck();
		
		
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
