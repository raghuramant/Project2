package testpack;

public class TestCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestCaseOne objuser2 = new TestCaseOne();
		
		TestCaseOne objuser1 = new TestCaseOne();
		objuser1.add(4, 5);
		objuser1.add(4, 5, 6);
		objuser1.reverseByAnu();

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
public void reverseByAnu() {
	String s="anu";
	String temp="";
	for (int i = s.length()-1; i >=0; i--) {
		char c = s.charAt(i);
		temp=temp+c;
		
	}
	System.out.println(temp);
	
}
}
