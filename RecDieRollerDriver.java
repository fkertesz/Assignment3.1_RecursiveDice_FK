/**
 * Application class to test methods of RecDieRoller object
 * @author Fanni Kertesz
 * @version 1.0
 * 10/5/23
 */
public class RecDieRollerDriver
{
	public static void main(String[] args)
	{
		RecDieRoller die = new RecDieRoller();//new die object
		
		//Testing methods
		System.out.println("Roll die until getting a 2: " + die.roll());
		
		System.out.println("Number of average rolls it takes to roll a 2: " + die.rollThousand());
	}//end main
}//end class
