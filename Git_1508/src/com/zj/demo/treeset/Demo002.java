package com.zj.demo.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import com.zj.demo.utils.Utils;

public class Demo002 {
	public static void main(String[] args) {
		/*
		 * set������Զ������
		 */
		TreeSet<Person> ts = new TreeSet<Person>() ;
		/*
		 * ���������������
		 * Exception in thread "main" java.lang.ClassCastException:
		 * com.zj.demo.treeset.Person cannot be cast to java.lang.Comparable
		 * -->���ԣ��˽�Comparable
		 */
//		ts.add(new Person("����", 23));
		
		for (Iterator<Person> it = ts.iterator(); it.hasNext() ;) {
			Utils.sop(it.next());
		}
		
	}
}
