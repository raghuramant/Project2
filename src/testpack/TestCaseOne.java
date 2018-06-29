package testpack;

public class TestCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestCaseOne objuser2 = new TestCaseOne();
		
		TestCaseOne objuser1 = new TestCaseOne();
		objuser1.add(4, 5);
		objuser1.add(4, 5, 6);
		objuser1.reverseSringKarthi("karthick");

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
	public void reverseSringKarthi(String name)
	{
		String a=name;
		String rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println("REVERSE STRING: "+rev);
	}
}
