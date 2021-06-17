package Diffrent_Ways_to_iterate_hashmap;
import java.util.*;

public class ways {

	public static void main(String[] args) {
		Map m= new HashMap();
		m.put(1, "apple");
		m.put(2, "banana");
		m.put(3, "lichii");
		m.put(4, "oragnge");
		//best itrate way of java8
		m.forEach( (key,value)->
		{ System.out.println(key+" "+value);
		});
	
	}

}
