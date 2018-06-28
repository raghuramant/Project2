package testpack;

public class TestCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TestCaseOne objuser2 = new TestCaseOne();

		TestCaseOne objuser1 = new TestCaseOne();
		objuser1.add(4, 5);
		objuser1.add(4, 5, 6);
		objuser1.reverseByHemanth();

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

	void reverseByHemanth() {
		String s = "Hemanth";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
