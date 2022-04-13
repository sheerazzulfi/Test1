class StringCheck
{
	public static void test()
	{
		String a="Hello";
		String b= new String("Hello");
		if (a==b) 
		{
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

	public static void main(String[] args) 
	{
		test();
	}
}