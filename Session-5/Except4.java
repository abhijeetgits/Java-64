//to divide a number by another with commandline args
class Except4 
{
	public static void main(String[] args) 
	{
		try{
		  int n1 = Integer.parseInt(args[0]);
		  int n2 = Integer.parseInt(args[1]);
		  int n3 = n1/n2;
		  System.out.println(n1+" / "+n2+" = "+n3);
		}
		catch(ArithmeticException ex){
		  System.out.println("ERROR: Cannot divide a number by zero");
		}
		catch(NumberFormatException ex){
		  System.out.println("ERROR: Please provide only numbers as cmd args");
		}
		catch(ArrayIndexOutOfBoundsException ex){
		  System.out.println("ERROR: Please provide min 2 cmd args");
		}
		System.out.println("** done **");
	}
}
