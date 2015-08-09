package com.zj.demo.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import com.zj.demo.utils.Utils;

public class Demo002 {
	public static void main(String[] args) {
		/*
		 * set中添加自定义对象
		 */
		TreeSet<Person> ts = new TreeSet<Person>() ;
		/*
		 * 如果像下面这样做
		 * Exception in thread "main" java.lang.ClassCastException:
		 * com.zj.demo.treeset.Person cannot be cast to java.lang.Comparable
		 * -->所以，了解Comparable
		 */
//		ts.add(new Person("张三", 23));
		
		for (Iterator<Person> it = ts.iterator(); it.hasNext() ;) {
			Utils.sop(it.next());
		}
		
	}
}
