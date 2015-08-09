package com.zj.demo.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import com.zj.demo.utils.Utils;

public class Demo001 {
	// learning treeset
	public static void main(String[] args) {
		TreeSet<String> tr = new TreeSet<String>();
		tr.add("abcd");
		tr.add("bcda");
		tr.add("bcad");
		tr.add("Abcd");
		for (Iterator<String> it = tr.iterator() ; it.hasNext() ;) {
			Utils.sop(it.next());
		}
	}
}
