/*
Q4. Make 2 classes twowheeler and fourwheeler(both having 2 functions- start() and stop()) and both inherit from abstract class Vehicle. Vehicle has 2 functions(void abstract start() and void stop()).
Print start and stop details of both classes(twowheeler and fourwheeler).
*/

abstract class Vehicle
{
	abstract void start();
	
	public void stop()
	{
		System.out.print("\n// stop() called for ");
	}
}

class twowheeler extends Vehicle
{
	public void start()
	{
		System.out.println("\n// start() called for twowheeler.");
	}
	public void stop()
	{
		super.stop();
		System.out.println("twowheeler.");
	}
}

class fourwheeler extends Vehicle
{
	public void start()
	{
		System.out.println("\n// start() called for fourwheeler.");
	}
	public void stop()
	{
		super.stop();
		System.out.println("fourwheeler.");
	}
}

class q4
{
	public static void main(String[] y)
	{
		twowheeler chetak = new twowheeler();
		chetak.start();
		
		fourwheeler baleno = new fourwheeler();
		baleno.start();
		
		chetak.stop();
		baleno.stop();
		
		System.out.println();
	}
}