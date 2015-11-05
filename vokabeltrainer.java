import java.util.*;

public class vokabeltrainer
{

	public static void main(String... args)
	{	
		System.out.println("---------------------------------");

		Scanner scanner = new Scanner(System.in);

		String[] de = new String[]{"Konto", 	"Haus"};
		String[] en = new String[]{"account",	"house"};

		Random r = new Random();

		float richtig = 0.0f;
		float gesamt = 0.0f;

		do
		{
			int index = r.nextInt((de.length));
			System.out.print(de[index]+": ");

			String  eingabe = scanner.next();
			gesamt++;
			if(eingabe.equals(en[index]))
			{
				richtig++;
				System.out.print("Richtig");
			}
			else
			{
				System.out.print("Falsch (richtige Antwort: "+en[index]+")");
			}

			System.out.println("- Weiter (J/N)?");
		}
		while(scanner.next().equals("j"));


		System.out.println("Erfolgsquote: "+(richtig/gesamt * 100)+"%");

		System.out.println("\r\n---------------------------------");

	}
}