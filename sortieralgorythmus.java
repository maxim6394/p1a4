import java.util.*;

public class sortieralgorythmus
{

	public static void main(String... args)
	{	
		System.out.println("---------------------------------");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Anzahl Zahlen: ");
		int[] arr = new int[scanner.nextInt()];


		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("Zahl "+(i+1)+": ");
			arr[i] = scanner.nextInt();
		}

		System.out.println("");


		System.out.print("Originale Reihenfolge: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

		System.out.println("");

		System.out.print("Umgekehrte Reihenfolge: ");
		for(int i = arr.length-1; i >= 0 ; i--)
		{
			System.out.print(arr[i]+" ");
		}



		for(int i = 0; i < arr.length; i++)
		{
			for(int h = i; h<arr.length; h++)		// für jedes elemente alle elemente (außer die vorherigen) durchgehen und das 
			{										// kleinste jeweils an die erste position setzen		
				if(arr[h] < arr[i])
				{
					int temp = arr[i];				//arr[i] muss in eigener variable gespeichert werden da es im nächsten schritt
					arr[i] = arr[h];				//überschrieben wird und sonst verloren geht
					arr[h] = temp;
				}
			}
		}


		System.out.print("Sortierte Reihenfolge : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}


		System.out.println("\r\n---------------------------------");

	}
}