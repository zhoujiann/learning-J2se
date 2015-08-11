package com.zj.demo.treeset;

import com.zj.demo.utils.Utils;

public class Person implements Comparable<Object>{
	private String name ;
	private int age ;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void shout(){
		Utils.sop(name + " 今年 " + age + " 岁了 ~");
	}

	@Override
	public int compareTo(Object obj) {
		if (!(obj instanceof Person))
			throw new RuntimeException("is not a Person Obj");
		Person person = (Person) obj ;
		/*
		 * 为什么和毕向东的比较顺序不一样，是因为jdk的原因吗
		 * 此外，jdk1.7即使放入单个自定义对象，也不能够输出了
		 */
		Utils.sop(this.name + ".......CompareTo......." + person.name);
		if (this.age > person.age)
		return 11;
		
		if(this.age == person.age)
			return this.name.compareTo(person.name) ;
		return -1 ;
		
	}
	
	
	
}
