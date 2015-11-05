import java.util.*;

public class wuerfelbecher
{
	public static void main(String... args)
	{	
		System.out.println("---------------------------------");

		int[] arr = new int[6];

		Random rand = new Random();

		int min = 6;
		int max = 0;
		int summe = 0;



		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = rand.nextInt((6-1)+1)+1;
			
			if(arr[i]<min)
				min = arr[i];
			else if(arr[i] > max)
				max = arr[i];

			summe += arr[i];

			System.out.print(arr[i]+"	");

			for(int h = 0; h<i; h++)
			{
				if(arr[h] == arr[i])
				{
					System.out.print("	(wurde mehrfach gewürfelt)");
					break;
				}
			}

			System.out.println("");

		}

		System.out.println("\r\n---------------------------------");

	}
}