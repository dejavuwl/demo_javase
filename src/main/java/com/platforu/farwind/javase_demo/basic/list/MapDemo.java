package com.platforu.farwind.javase_demo.basic.list;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author wlsto
 * @created 2020年3月23日
 * @description MapDemo.java
 */
public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Map
		/*
		 * HashMap: 键值对存储 hash表 key:value
		 * 1.key不能重复，如果重复，value的值将会被覆盖
		 * 2.key和value都可以为null
		 * 3.无序存储
		 * 4.非线程安全
		 */
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "北京");
		map.put("2", "上海");
		map.put("3", "广州");
		map.put("4", "深圳");
		// 通过key获取数据
		System.out.println(map.get("2"));
		// 修改数据
		map.put("3", "武汉");
		System.out.println(map.get("3"));
		map.put(null, null);
		map.put(null, "其他城市");
		System.out.println(map.get(null));
		
		map.remove("4");
		System.out.println(map.get("4"));
		
		// 遍历
		System.out.println("----遍历----");
		// 通过迭代器只遍历value
		Iterator<String> it = map.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("---------遍历key和value-----------");
		// keySet方法返回所有的key集合
		for(String key:map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		// entrySet方法返回key和value的对象集合
		for(Entry<String, String> entry:map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		
		/*
		 * HashTable
		 * 1.key和value都不允许有null值
		 * 2.线程安全
		 */
		
		Map<String, String> table = new Hashtable<String, String>();
		table.put("1", "杭州");
		table.put("2", "苏州");
		table.put("3", "三亚");
		table.put("4", "厦门");
		// table.put(null, null);
		// table.put("5", null);
		
		for(Entry<String,String> set:table.entrySet()) {
			System.out.println(set.getKey()+":"+set.getValue());
		}
		
		
	}

}
