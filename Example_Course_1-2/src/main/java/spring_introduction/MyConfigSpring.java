package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfigSpring {
    @Bean
    @Scope("singleton")
    Pet catBean() {
        return new Cat();
    }
    
	@Bean
    public Person personBean() {
    	return new Person(catBean());
    }
}
