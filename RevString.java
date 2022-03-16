class RevString
{
	public static void test(String a)
	{
		String b="";
		for (int i=a.length()-1;i>=0 ;i-- ) 
		{
			b+=Character.toString(a.charAt(i));
		}
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		String a="ABCD";
		test(a);
	}
}