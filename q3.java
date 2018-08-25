/*
Q3. Overload Print function to accept Null arguments , one integer , one float.
*/

class display
{
	public void print()
	{
		System.out.println("// print() called.");
	}
	
	public void print(int num)
	{
		System.out.println("// print(int " + num + ") called.");
	}
	
	public void print(float num)
	{
		System.out.println("// print(float " + num + ") called.");
	}
}

class q3
{
	public static void main(String[] x)
	{
		display obj = new display();
		System.out.println("\nCalling print():-");
		obj.print();
		
		System.out.println("\nCalling print(10):-");
		obj.print(10);
		
		System.out.println("\nCalling print(15.00f):-");
		obj.print(15.00f);
	}
}