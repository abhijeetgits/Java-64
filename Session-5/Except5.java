//to divide a number by another with commandline args
class Except5
{
	public static void main(String[] args) 
	{
		try{
		  int n1 = Integer.parseInt(args[0]);
		  int n2 = Integer.parseInt(args[1]);
		  int n3 = n1/n2;
		  System.out.println(n1+" / "+n2+" = "+n3);
		}
		catch(Exception ex){
		  System.out.println("Exception Occured:");
		  System.out.println("Message: "+ ex.getMessage());
		  System.out.println(ex.toString());
		  ex.printStackTrace(); //toString()+call stack
		
		  if(ex instanceof ArrayIndexOutOfBoundsException){
		   System.out.println("Invalid Array Index : "+ ex.getMessage());
		  }
		}

		System.out.println("** done **");
	}
}
