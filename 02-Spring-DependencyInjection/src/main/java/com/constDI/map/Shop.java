package com.constDI.map;

import java.util.Map;

public class Shop {
		public String name;
		Map<String , Integer> items;
		
		public void display() {
			System.out.println("Shop Details");
			System.out.println("=============");
			System.out.println("Name: "+name);
			System.out.println("=============Items===========");
			for (Map.Entry<String, Integer> item : items.entrySet()) {
				System.out.println(item.getKey()+" ==> "+item.getValue());
				
			}
		}

		public Shop(String name, Map<String, Integer> items) {
			this.name = name;
			this.items = items;
		}
		
		

		
		
}
