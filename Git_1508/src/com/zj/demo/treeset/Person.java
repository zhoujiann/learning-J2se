package com.zj.demo.treeset;

import com.zj.demo.utils.Utils;

public class Person {
	private String name ;
	private int age ;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void shout(){
		Utils.sop(name + " ½ñÄê " + age + " ËêÁË ~");
	}
	
	
}
