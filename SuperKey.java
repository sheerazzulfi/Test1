// Super keyword can only be used inside a method in order to print the value of superclass having same reference variable as the sub-class.

class A
{
	int a=10;
}

class B extends A
{
	int a=20;
	void test()
	{
		System.out.println("Value of class A is "+super.a);
		System.out.println("Value of class B is "+a);
	}

}


class SuperKey
{
	public static void main(String[] args) 
	{
		B c= new B();
		c.test();
	}
}
