package ameerpetLab1;

import java.util.HashMap;
import java.util.Map;

public class MapString {
    public static void main(String[] args) {
        // Step 1: Create and populate the Map
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("name", "John Doe");
        myMap.put("email", "john.doe@example.com");
        myMap.put("phone", "123-456-7890");
		
		String key = "email";
		String value = myMap.get(key);
		
		System.out.println(myMap.get("name"));

		 if (value != null) {
            System.out.println("The value for key '" + key + "' is: " + value);
        } else {
            System.out.println("Key '" + key + "' not found in the map.");
        }
		
	}
}
		

