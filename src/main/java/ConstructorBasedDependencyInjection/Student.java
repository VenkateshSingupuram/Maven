package ConstructorBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;

	Course course;

// This is Called Construtor Based Dependency Injection

	public Student(Course course) {
		super();
		this.course = course;
	}

	public String getName() {
		return name;
	}

	@Value("Saroja")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

}
