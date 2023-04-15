package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Animals {
	
	@Autowired
	@Qualifier("jaguar")
	private FelineAnimals feline;
	
	public void action() {
		System.out.print(" action: ...");
	}
	
	@PostConstruct
	private void init() {
		System.out.println(" **** this work init method ****");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println(" !!!! Work MWTHOD destroy !!!!");
	}
}
