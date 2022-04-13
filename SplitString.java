//Program to get integers from string///

class SplitString
{
	public static void main(String[] args) 
	{
		String a="10,201?30.5|44";

		String[] b = a.split("\\D+");

		int [] c= new int[b.length];

		for (int i=0;i<b.length ;i++ ) 
		{
			c[i]=Integer.parseInt(b[i]);
			System.out.println(c[i]);
		}
	}
}
