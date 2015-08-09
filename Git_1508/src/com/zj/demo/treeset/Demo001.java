package com.zj.demo.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo001 {
	// learning treeset
	public static void main(String[] args) {
		TreeSet<String> tr = new TreeSet<String>();
		tr.add("abcd");
		tr.add("bcda");
		tr.add("bcad");
		tr.add("Abcd");
		for (Iterator<String> it = tr.iterator() ; it.hasNext() ;) {
			sop(it.next());
		}
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
	
}
