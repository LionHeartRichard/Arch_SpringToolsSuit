package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Leon implements FelineAnimals{

	@Override
	public void roar() {
		System.out.println("roar the LEON!!!");		
	}

}
