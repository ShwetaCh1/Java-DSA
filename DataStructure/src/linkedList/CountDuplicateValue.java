package linkedList;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountDuplicateValue {
	 String s = "abcdebadfa";
	HashMap<Character, Integer>hashMap=new LinkedHashMap<>();
	 for(int i1 = 0; i < s.length(); i++) {
	  char c = s.charAt(i1);
	  if(hashMap.containsKey(c)) {
	  int currentCount = hashMap.get(c);
	  hashMap.put(c, currentCount+1);

	  }else {
	  hashMap.put(c, 1);
	  }
	 }
	 System.out.println(hashMap);
	 for(int i = 0; i < s.length(); i++) {
	  if(hashMap.get(s.charAt(i1)) == 1){
	  System.out.println(s.charAt(i1));
	  break;
	  }
	 }

}
