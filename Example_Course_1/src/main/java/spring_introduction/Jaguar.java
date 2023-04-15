package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Jaguar implements FelineAnimals {

	private static int count = 0;

	
	protected Jaguar() {
		this.count++;
	}
	
	@Override
	public void roar() {
		System.out.println(" '''roar ''' the Jaguar!!!");
	}

	public void printCount() {
		System.out.println("Count bean jaguar = " + this.count);
	}

}
