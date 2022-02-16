
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		//
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("i");
			}
			System.out.println();
		}
		// assignment questions -1
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		// assignment questions -2
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		//Assignment question -3
		
		
	for(char ch='A';ch<='C';ch++)
	{
		for(char cha='A';cha<=ch;cha++)
		{
		System.out.print(ch);
		}
		System.out.println();
	}
	
	// Assignment questions-4
	for(char ch='A';ch<='C';ch++)
	{
		for(char cha='A';cha<=ch;cha++)
		{
			System.out.print(cha+" ");
		}
		System.out.println();
	}
//Assignment questions -5
	int n=10;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==0||i==n-1||j==0||j==n-1)
				System.out.print('*');
			else
				System.out.print(" ");
					
		}
		System.out.println();
	}
	//Assignment questions -6
	
	int m=4;
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<m;j++)
		{
			if(i==0||j==0||i==m-1||j==m-1)
			{
				System.out.print('$');
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	//Assignment questions-7
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==0||j==0||i==n/2||j==n-1||i==n-1)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	//for extra space
	System.out.println();
	
	//Assignment questions-8
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||j==n/2||j==n-1||i==n-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Assignment questions-9
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==n/2||i==n/2||i==n-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		//Assignment questions-10
		
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n/2;j++)
					{
						if(i==0||j==0||j==n/2||i==0 &&j==n/2||i==n/2 && j<=n/2||i==n-1||j==n/2-1)
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.println();
				}
	}

}
