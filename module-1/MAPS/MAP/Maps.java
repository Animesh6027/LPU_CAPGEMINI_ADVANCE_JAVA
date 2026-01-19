/*
MAP:
	Map is an interface, present inside java.util package.
	It is used to store data in key-value pair.
	One key-value pair is known as one entry.
	Keys must be unique
	Values can be duplicate.
	Map Does not comes under collection because in collection we store only object, but in map we store objects in the form of key-value pairs.
	Map interface has 3 implementing classes: HashMap, LinkedHashMap, and TreeMap.

put(Object key, Object value):
	It is used to add entry inside map.
	Return type: Object
	It will return previous value of key, if we are adding key first time so it will return null.
	If we try to store duplicate key it will override previous value.

remove(Object key):
	It is used to remove entry from map based on key.
	Return type: Object
	It will return the value of removed key.

containsKey(Object key):
	It is used to check whether the given key is present inside map or not.
	Return type: boolean

containsValue(Object value):
	It is used to check whether the given value is present inside map or not.
	Return type: boolean

get(Object key):
	It is used to get the value of given key.
	Return type: Object

entrySet():
	It is used to convert all the entries of map into set.
	Return type: Set interface

keySet():
	It is used to get all the keys of map in the form of set.
	Return type: Set interface

values():
	It is used to get all the values of map in the form of collection.
	Return type: Collection interface
*/

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
public class Maps {
	public static void main(String[] args) {
		Map hm = new HashMap();
		System.out.println(hm.put(1, "Kabir"));
		System.out.println(hm.put(12.25, 12.50));
		System.out.println(hm.put(12.5,false));
		System.out.println(hm.put(1, "Amit"));
		System.out.println(hm);
		System.out.println(hm.remove(12.25));
		System.out.println(hm);

		System.out.println(hm.containsKey(12.5));
		System.out.println(hm.containsValue("Kabir"));
		System.out.println(hm.get(1));

		Set entries = hm.entrySet();
		System.out.println("Set: " + entries);

		for(Object obj : entries) {
			System.out.println(obj);
		}

		Set keys = hm.keySet();
		System.out.println("Keys: " + keys);
		
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		Collection values = hm.values();
		System.out.println("Values: " + values);

		Iterator it1 = values.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}