package co.edureka.except;

public class Except2 {
	static void m3() {
		  int a=10, b=0, c= 0;
		  c=a/b;
		  System.out.println("result = "+ c);
		  System.out.println("** done **");
	}
	static void m2() {
		m3();
	}
	static void m1() {
		m2();
	}
	public static void main(String[] args) {
		//String str="edureka";
		String str = null;
		System.out.println(str.length());
		m1();
	}

}
