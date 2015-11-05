import java.util.*;

public class haeufigkeiten
{

	public static void main(String... args)
	{	
		System.out.println("---------------------------------");

		int[] ergebnisse = new int[66];
		int[] haeufigkeiten = new int[5];


		Random rand = new Random();



		for(int i = 0; i < ergebnisse.length; i++)
		{
			ergebnisse[i] = rand.nextInt(51);
			if(ergebnisse[i] <= 40)
			{
				if(ergebnisse[i] <= 30)
				{
					if(ergebnisse[i] <= 20)
					{
						if(ergebnisse[i] <= 10)
						{
							haeufigkeiten[0]++;
						}
						else
						{
							haeufigkeiten[1]++;
						}
					}
					else
					{
						haeufigkeiten[2]++;
					}
				}
				else
				{
					haeufigkeiten[3]++;
				}
			}
			else
			{
				haeufigkeiten[4]++;
			}
		}


		System.out.print("0 ... 10 Punkte: "); 
		System.out.printf("%.2f",haeufigkeiten[0] / 66.0 * 100);
		System.out.println("%");

		System.out.print("11 ... 20 Punkte: "); 
		System.out.printf("%.2f",haeufigkeiten[1] / 66.0 * 100);
		System.out.println("%");

		System.out.print("21 ... 30 Punkte: "); 
		System.out.printf("%.2f",haeufigkeiten[2] / 66.0 * 100);
		System.out.println("%");

		System.out.print("31 ... 40 Punkte: "); 
		System.out.printf("%.2f",haeufigkeiten[3] / 66.0 * 100);
		System.out.println("%");

		System.out.print("41 ... 50 Punkte: "); 
		System.out.printf("%.2f",haeufigkeiten[4] / 66.0 * 100);
		System.out.println("%");


		System.out.println("\r\n---------------------------------");

	}
}