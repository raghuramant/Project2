package testpack;

public class TestCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TestCaseOne objuser2 = new TestCaseOne();

		TestCaseOne objuser1 = new TestCaseOne();
		objuser1.add(4, 5);
		objuser1.add(4, 5, 6);
		objuser1.reverseByJana();

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

	public void reverseByJana() {

		String s = "jana";
		String split = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			split = split + ch;
		}
		System.out.println(split);
	}
}
