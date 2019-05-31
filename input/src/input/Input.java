package input;
import java.util.Scanner;
public class Input 
{
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		System.out.println("inserisci due numeri");
		x = input.nextInt();
		y = input.nextInt();
		System.out.println("la somma dei due numeri e'");
		System.out.print(x + y);
	}
}
