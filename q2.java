/*
Q2. Make Class Animal(with properties breed and colour and function speak()), class Dog and class Cat. Dog and Class inherit from Animal class.You need to override speak function of Animal Class.
*/

abstract class Animal
{
	protected String breed,colour;
	
	abstract public void speak();
}

class Dog extends Animal
{
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	public void speak()
	{
		System.out.println("I'm a DOG. Bark! Bark!");
		System.out.println("I'm a " + colour + " coloured " + breed);
		System.out.println();
	}
}

class Cat extends Animal
{
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	public void speak()
	{
		System.out.println("I'm a CAT. Meow!");
		System.out.println("I'm a " + colour + " coloured " + breed);
		System.out.println();
	}
}

class q2
{
	public static void main(String[] y)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.setBreed("Labrador");
		d.setColour("Brown");
		
		c.setBreed("Munchkin Cat");
		c.setColour("Orange");
		
		d.speak();
		c.speak();
	}
}