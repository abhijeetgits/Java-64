package co.edureka;
import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest 
{
	public static void main(String[] args) {
		out.println(E);
		out.println(PI);
		out.println(sqrt(25));
		out.println(sin(0));
		out.println(cos(0));
		System.out.println(min(23, 40));
		System.out.println(floor(10.9)); //10.0
		System.out.println(ceil(20.1)); //21.0
		double rand = Math.random(); //0.0 - 1.0
		System.out.println(rand);
		System.out.println((int)(rand*10000));
	}
}
