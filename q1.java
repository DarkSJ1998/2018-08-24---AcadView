/* 1.Study about Static blocks and push 1 example code on github.  */

class abc
{
	private static int a;
	static
	{
		System.out.println("// Static block of abc called.");
		a = 100;
	}
	public int getA()
	{
		return a;
	}
}

class q1
{
	static
	{
		System.out.println("// Static block of abc called.");
	}
	
	public static void main(String x[])
	{
		System.out.println("// main() called.");
		System.out.println("// Creating an object of abc.");
		abc obj = new abc();
		
		System.out.println("// After creating an object of abc,\na = " + obj.getA());
	}
}