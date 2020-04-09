/**
 * 
 */
package com.platforu.farwind.javase_demo.basic.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wlsto
 *
 */
public class SetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Set集合，底层采用HashMap实现
		/*
		 * 特点：
		 * 1.没有索引
		 * 2.不允许有重复元素
		 * 3.元素是无序的，与add顺序不一致
		 * 4.允许有null值
		 * 5.非线程安全
		 */
		Set<String> set = new HashSet<String>();
		set.add("123");
		set.add("abc");
		set.add("456");
		set.add("sss");
		set.add("789");
		set.add("123456");
		set.add(null);
		set.add(null);
		System.out.println(set);
		for(String temp:set) {
			System.out.println(temp);
		}
		
		
		// 集合中存放对象
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		HashSet<Object> objSet = new HashSet<Object>();
		obj1 = obj2;
		objSet.add(obj1);
		objSet.add(obj2);
		System.out.println(objSet);
		
		
		
		/*
		 * TreeSet
		 * 1.有序集合，元素按照自然排序
		 * 2.不允许有null值
		 * 3.线程安全的
		 * 4.不允许有重复元素
		 */
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("a");
		treeSet.add("e");
		treeSet.add("c");
		treeSet.add("f");
		treeSet.add("b");
		treeSet.add("b");
		treeSet.add("d");
//		treeSet.add(null);
		System.out.println(treeSet);
		
		// 迭代器
		Iterator<String> it = treeSet.iterator();
		// 判断是否有下一条数据
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
