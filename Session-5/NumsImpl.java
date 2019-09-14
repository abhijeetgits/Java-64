class NumsImpl implements Nums 
{
	public void addNum(int x, int y){
		System.out.println("Sum = "+ (x+y));
	}
	public float subNum(float a, float b){
		return a-b;
	}
	public static void main(String[] args) 
	{
		//NumsImpl obj = new NumsImpl();
		Nums obj = new NumsImpl();
		System.out.println(obj.a+" | "+obj.b);
		System.out.println(Nums.a+" | "+Nums.b);
		System.out.println(NumsImpl.a+" | "+NumsImpl.b);

		//obj.a=20;
		obj.addNum(10,20);
		System.out.println("Difference = "+ obj.subNum(10f,20f));
	}
}
