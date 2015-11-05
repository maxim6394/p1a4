import java.util.*;

public class sieb
{
	public static void main(String... args)
	{	
		System.out.println("---------------------------------");

		int n = 1000;

		boolean[] arr = new boolean[n+1];
		for(int i = 2; i<arr.length; i++)
		{
			arr[i] = true;
		}

		for(int i=2; i<=n; i++)
		{
			for(int h = 2; h<arr.length; h++)
			{
				int vielfaches = h*i;
				if(vielfaches < arr.length)
				{
					arr[vielfaches] = false;
				}
				else
				{
					break;
				}
			}
		}

		System.out.println("Primzahlen: ");
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i])
			{
				System.out.print(i+" ");	
			}
			
		}


		System.out.println("\r\n---------------------------------");

	}
}