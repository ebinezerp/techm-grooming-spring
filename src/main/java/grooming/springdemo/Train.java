package grooming.springdemo;

import org.springframework.stereotype.Component;

@Component("train")
public class Train implements Vehicle{
	
	public void transport() {
		System.out.println("Train Jry");
	}

}
