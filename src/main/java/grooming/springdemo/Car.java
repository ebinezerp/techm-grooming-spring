package grooming.springdemo;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {

	public void transport() {
		System.out.println("Car Jry");
	}

}
