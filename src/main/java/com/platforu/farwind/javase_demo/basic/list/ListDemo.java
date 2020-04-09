package com.platforu.farwind.javase_demo.basic.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	/**
	 * List集合
	 * 集合：与数组类似，存放一些数据的集合
	 * 1.长度可变
	 * 2.可以放不同的数据类型
	 * 3.通过下标索引来获取数据，从0开始
	 * 4.List集合中元素是有序的
	 * 5.允许有重复的元素
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(123);
		list.add("zhangsan");
		list.add(new Object());
		// 获取单个数据
		System.out.println(list.get(1));
		// 获取长度
		System.out.println("长度"+list.size());
		// 删除元素
		list.remove(0);
		System.out.println("删除后长度"+list.size());
		System.out.println(list.get(0));
		
		// 遍历集合
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		/*
		 *  链表集合
		 */
		List<String> linkList = new LinkedList<String>();
		linkList.add("123");
		linkList.add("456");
		linkList.add("789");
		linkList.add(null);
		linkList.add(null);
		for(String temp:linkList) {
			System.out.println(temp);
		}
		
	}
}
