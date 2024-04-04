package jp.schoo.java.eclipse.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.schoo.java.eclipse.Student;

class Test1 {

	@Test
	void test1() {
		Student s = new Student();
		s.setId(123);
		System.out.println(s.getId());
	}
	
	@Test
	void test2() {
		Student s = new Student();
		s.setName("abc");
		System.out.println(s.getName());
	}
}
