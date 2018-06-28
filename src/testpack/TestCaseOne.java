package testpack;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCaseOne {
	
	
	public void findCountWordList(String content) {
		
		String[] word = content.split(" ");
		List<String> asList = Arrays.asList(word);
		Map<String,Integer> m=new HashMap<String,Integer>();
		for (String w : asList) {
			Integer i = m.get(w);
			m.put(w,(i==null)?1:i+1);	
		}
		System.out.println(m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestCaseOne objuser2 = new TestCaseOne();
		
		TestCaseOne objuser1 = new TestCaseOne();
		objuser1.add(4, 5);
		objuser1.add(4, 5, 6);
		objuser1.findCountWordList("AAA CCC AAA BBB CCC BB");

	}

	void thisismytestcaseone() {
		System.out.println("test case one logic");
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void add(int a, int b) {
		System.out.println(a + b);
	}
	
}
