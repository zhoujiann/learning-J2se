package com.zj.demo.treeset;

import java.util.Iterator;
import java.util.TreeSet;


public class Demo002 {
	public static void main(String[] args) {
		 // set������Զ������
		TreeSet<Person> ts = new TreeSet<Person>() ;
		/*
		 * ���������������
		 * Exception in thread "main" java.lang.ClassCastException:
		 * 		com.zj.demo.treeset.Person cannot be cast to java.lang.Comparable
		 * -->���ԣ��˽�Comparable
		 * 
		 * 
		 *  ����.......CompareTo.......����
		 *	����.......CompareTo.......����
		 *	����.......CompareTo.......����
		 *	����.......CompareTo.......����
		 *	���� ���� 21 ���� ~
		 *	���� ���� 23 ���� ~
		 *	���� ���� 25 ���� ~
		 *
		 *��������jdk1.6��Ϊ��ͬ��1.7�У������Եĵ�����ʽ�ıȽϣ�
		 * ��һ�е�������ܺ����Ե�˵��Ϊ��ֻ��һ���Զ���Ԫ��Ҳ���ܹ���ts��������
		 * �����Ƚ�
		 */
		ts.add(new Person("����",25));
		ts.add(new Person("����",21));
		ts.add(new Person("����",23));
//		for (Iterator<Person> it = ts.iterator(); it.hasNext() ;) {
//			it.next().shout();
//		}
		Iterator<Person> it = ts.iterator() ;
		while(it.hasNext()){
			it.next();
		}
		
		
	}
}
