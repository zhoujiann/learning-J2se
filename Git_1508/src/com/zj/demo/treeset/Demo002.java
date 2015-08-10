package com.zj.demo.treeset;

import java.util.Iterator;
import java.util.TreeSet;


public class Demo002 {
	public static void main(String[] args) {
		 // set中添加自定义对象
		TreeSet<Person> ts = new TreeSet<Person>() ;
		/*
		 * 如果像下面这样做
		 * Exception in thread "main" java.lang.ClassCastException:
		 * 		com.zj.demo.treeset.Person cannot be cast to java.lang.Comparable
		 * -->所以，了解Comparable
		 * 
		 * 
		 *  张三.......CompareTo.......张三
		 *	李四.......CompareTo.......张三
		 *	王五.......CompareTo.......张三
		 *	王五.......CompareTo.......李四
		 *	李四 今年 21 岁了 ~
		 *	王五 今年 23 岁了 ~
		 *	张三 今年 25 岁了 ~
		 *
		 *输出结果和jdk1.6大为不同，1.7中，很明显的迭代形式的比较，
		 * 第一行的输出就能很明显的说明为何只有一个自定义元素也不能够用ts迭代出来
		 * 遍历比较
		 */
		ts.add(new Person("张三",25));
		ts.add(new Person("李四",21));
		ts.add(new Person("王五",23));
//		for (Iterator<Person> it = ts.iterator(); it.hasNext() ;) {
//			it.next().shout();
//		}
		Iterator<Person> it = ts.iterator() ;
		while(it.hasNext()){
			it.next();
		}
		
		
	}
}
