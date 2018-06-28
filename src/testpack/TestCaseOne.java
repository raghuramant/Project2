package testpack;

public class TestCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestCaseOne objuser2 = new TestCaseOne();
		
		TestCaseOne objuser1 = new TestCaseOne();
		objuser1.add(4, 5);
		objuser1.add(4, 5, 6);
        TestCaseOne rev = new TestCaseOne();
        rev.reversePriya();
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
   public void reversePriya() {
	   String Name = "Priya";
	   String Reverse = "";
	   int length = Name.length();
	   for(int i = length-1; i>=0; i-- ) {
		   Reverse = Reverse + Name.charAt(i);
	   }
	   System.out.println(Reverse);
	   }
   }


