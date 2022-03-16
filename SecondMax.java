class SecondMax
{
	public static int test(int [] a)
	{
		int se=a[0];
		int temp=0;
		for (int i=0;i<3 ;i++ ) 
		{
			for (int j=0;j<a.length ;j++ ) 
			{
				if (a[j]>=se) 
				{
					se=a[j];
					temp=j;
				}
			}
			if (i==0 || i==1) 
			{
				a[temp]=0;
				se=a[0];
			}
			
		}
		return se;
	}

	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5};
		System.out.println(test(a));
	}
}
