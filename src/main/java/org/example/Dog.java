package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Animal{
	private String name;

	public Dog(@Value("Test Dog") String name) {
		this.name = name;
	}

//	@PostConstruct
	public void init(){
		System.out.println("Dog Init");
	}

//	@PreDestroy
	public void destroy(){
		System.out.println("Dog Destroy");
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				'}';
	}
}
