package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@VIP
//@Component
public class User {

//	@Autowired
	private Animal cat;

//	@Autowired
//	@Qualifier("dog")
	private Animal dog;

//	@Autowired
//	public void setCat(Cat cat) {
//		this.cat = cat;
//	}
//
//	@Autowired
//	@Qualifier("cat")
//	public void setDog(Animal dog2) {
//		this.dog = dog2;
//	}


//	public User() {
//	}
//
//	public User(Dog dog) {
//		this.dog = dog;
//	}
//
//	@Autowired
//	public User(@Qualifier("dog") Animal cat2, @Qualifier("dog") Animal dog2) {
//		this.cat = cat2;
//		this.dog = dog2;
//	}


	public User(Animal cat, Animal dog) {
		this.cat = cat;
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "User{" +
				"cat=" + cat +
				", dog=" + dog +
				'}';
	}
}
