package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//singleton
//prototype

@Configuration
@ComponentScan(basePackages = "org.example")
public class RootConfiguration {

//	@Bean
//	public Cat cat(){
//		return new Cat("Test Cat");
//	}
//
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Dog dog(){
		return new Dog("Test Dog");
	}
//
	@Bean
	public User user(@Qualifier("dog") Animal cat2,
									 @Qualifier("cat") Animal dog2){
		return new User(cat2, dog2);
	}

	@Bean
	public User user2(@Qualifier("dog") Animal cat2,
									 @Qualifier("cat") Animal dog2){
		return new User(cat2, dog2);
	}
}
