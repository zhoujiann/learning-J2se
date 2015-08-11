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
		Utils.sop(name + " ���� " + age + " ���� ~");
	}

	@Override
	public int compareTo(Object obj) {
		if (!(obj instanceof Person))
			throw new RuntimeException("is not a Person Obj");
		Person person = (Person) obj ;
		/*
		 * Ϊʲô�ͱ��򶫵ıȽ�˳��һ��������Ϊjdk��ԭ����
		 * ���⣬jdk1.7��ʹ���뵥���Զ������Ҳ���ܹ������
		 */
		Utils.sop(this.name + ".......CompareTo......." + person.name);
		if (this.age > person.age)
		return 11;
		
		if(this.age == person.age)
			return this.name.compareTo(person.name) ;
		return -1 ;
		
	}
	
	
	
}
