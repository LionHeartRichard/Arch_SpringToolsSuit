package spring_introduction;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	private Pet pet;
	
	private String name;
	private int age;
	
	Person(Pet pet) {
		this.pet = pet;
		pet.say();
	}
	
	public void callYourPet() {
		System.out.println("   Hi my lovely PET!!!");
		this.pet.say();
	}

	
	
	public String getName() {
		return name;
	}

	@Value("${person.name}")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Value("${person.age}")
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
