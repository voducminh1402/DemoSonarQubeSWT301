package com.test;

public class DemoTest {
	private String name;
	private String age;
	
	public DemoTest() {
		this.name = "Minh";
		this.age = "14";
	}

	public DemoTest(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public String getInfo() {
		return getName() + " is " + getAge() + " years old";
	}
	
	public void testBug() {
		for (;;) {
			System.out.println("Hello bug");
		}
	}
	
	public void testDemo1() {
		String tmp = "temp";
		String main = "main";
		
		System.out.println(main);
	}
	
	public static void main(String[] args) {
		DemoTest demo = new DemoTest();
		System.out.println(demo.getInfo());
		demo.testDemo1();
	}
	
}