package hyderbadHostel;

import java.util.*;

import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class Day0 {

	public static void main(String args[]) {
		Map map = new HashMap<String, Integer>();
		map.put("String", 5);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		List li = new ArrayList();
		li.add("as");
		li.add("af");
		li.add("as");
		li.add("aj");

		Set set = new HashSet(li);
		System.out.println("res :"+set);

	}
}
