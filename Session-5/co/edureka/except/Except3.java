package co.edureka.except;

public class Except3 {

	public static void main(String[] args) {
		String data = "625";
		System.out.println(25+data); //25625
		//parsing - convert String to int or any numeric type
		int n = Integer.parseInt(data);
		System.out.println(25+n); //650
		
		//n = Integer.parseInt("34");
		n = Integer.parseInt("A"); //java.lang.NumberFormatException
		System.out.println(n);
		n = 'A';
		System.out.println(n);
	}
}
