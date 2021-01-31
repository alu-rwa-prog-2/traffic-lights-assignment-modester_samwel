package maping;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Creating a HashMap
		HashMap <String, String>  Programming_Languages = new HashMap<String, String>();
		
		//Creating Key and Values for Best programming languages and Companies that love that language
		Programming_Languages.put("Python", "Google");
		Programming_Languages.put("Java", "Intel");
		Programming_Languages.put("C++", "Apple");
		System.out.println(Programming_Languages);
		
		//Creating Key/Values and copying the first mappings to the second map
		HashMap <String, String> Programming_Languages1 = new HashMap<>();
		Programming_Languages1.put("Go", "Uber");
		Programming_Languages1.put("Rubby", "Twitter");
		Programming_Languages1.putAll(Programming_Languages);
		System.out.println(Programming_Languages1);
		
		//Creating Key/Values and copying the first mappings to the second map
		HashMap <String, String> Programming_Languages2 = new HashMap<>();
		Programming_Languages2.put("Kotlin", "Amazonn");
		Programming_Languages2.put("JavaScript", "Microsoft");
		Programming_Languages2.putAll(Programming_Languages1);
		System.out.println(Programming_Languages2);
		
		//Creating Key/Values and copying the second mappings to the third map
				HashMap <String, String> Programming_Languages3 = new HashMap<>();
				Programming_Languages3.put("C#", "Alibaba");
				Programming_Languages3.put("Swift", "Slack");
				Programming_Languages3.putAll(Programming_Languages2);
				System.out.println(Programming_Languages3);
		
	}

}
