package com.hashMapExample;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HashMapExamplesApplication {

	private static final Logger logger = LoggerFactory.getLogger(HashMapExamplesApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(HashMapExamplesApplication.class, args);
		
		HashMap<Integer, String> map = new HashMap<>();
		
		logger.info("Size of map is before inserting the element :  {}" , map.size());
		
		//Put elements in Map 
		map.put(1,"Mango");   
		map.put(2,"Apple");    
		map.put(3,"Banana");   
		map.put(4,"Grapes"); 
		map.put(5,"Orange"); 
		map.put(6,"Pineapple"); 
		
		map.put(1,"Pomegranate"); //trying duplicate key 
		
		logger.info("Size of map is after inserting the element : {}" , map.size());
		
		logger.info("Initial list of elements: {}", map);  
		
        // Print and display the cloned HashMap using clone() method
		logger.info("The cloned map look like this :  {}" , map.clone());
		
		// get() method to get value
	    String value = map.get(1);
	    logger.info("Get value at Key 1: {}" , value);
	    
	    // return set view of keys using keySet()
	    logger.info("Keys in map : {}" , map.keySet());

	    // return set view of values using values()
	    logger.info("Values in map : {}" , map.values());

	    // return set view of key/value pairs using entrySet()
	    logger.info("Key/Value mappings: {}" , map.entrySet());
		
	    logger.info("Iterating Hashmap :  ");  
		for(Map.Entry mapData : map.entrySet()){    
			logger.info(mapData.getKey()+" "+mapData.getValue());    
		 }  
		
		 // Checking for the key_element '10'
		logger.info("Is the key 10 present? {}" , map.containsKey(10));
		
		 // Checking for the value_element 'Orange'
		logger.info("Is the value Orange present? {}" , map.containsValue("Orange"));
		
		map.putIfAbsent(8, "Avocado");  
		logger.info("After invoking putIfAbsent() method  : {}" , map); 	
		
	    map.remove(1);  
	    logger.info("Updated list of elements after removing 1 element : {}" , map);  
	    
	    map.remove(2, "Apple");  
	    logger.info("Updated list of elements after removing Apple : {}", map); 
	    
	    map.replace(3, "Mango");  
	    logger.info("Updated list of elements after replace(key, newValue) 3 key element with mango : {}" , map); 
	    
	    map.replace(4, "Grapes", "Apple"); 
	    logger.info("Updated list of elements after replace(key, oldValue, newValue) 4 key element with Apple : {}" , map); 
	    
	    
//	   // replace oldValue with square of oldValue using replaceAll method
//        map.replaceAll((key, oldKey) -> oldKey * oldKey);
//        logger.info("New HashMap after replaceAll : " + map);
	    
	 // provide new value for keys which is present using computeIfPresent method
	    map.computeIfPresent(6 , (key, val)-> value + "Fruit");
	    logger.info("HashMap after computeIfPresent '6' : {}" , map);
	    
	    // provide value for new key which is absent using computeIfAbsent method
        map.computeIfAbsent(11 , k -> "Hii " + "Hello");
        logger.info("HashMap after computeIfAbsent '11' : {}" , map);
        
        // Getting the hashcode value for the map
        logger.info("The hashcode value of the map: {}" , map.hashCode());
	    
	    // Creating a new hash map and copying
	    HashMap<Integer, String> new_map = new HashMap<Integer, String>();
	    new_map.putAll(map);
	  
	    // Displaying the final HashMap
	    logger.info("The new map looks like this: {}" , new_map);

	    
	}

}
