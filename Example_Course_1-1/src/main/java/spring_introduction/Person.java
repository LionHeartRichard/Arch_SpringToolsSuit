package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	@Qualifier("cat")
	private Pet pet;
	
	public void callYourPet() {
		System.out.println("   Hello my lovely pet!!!");
		pet.say();
	}
}
