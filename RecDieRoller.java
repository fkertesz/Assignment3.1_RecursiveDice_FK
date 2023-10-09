import java.util.Random;
/**
 * RecDieRoller class for a recursive dice object.
 * @author Fanni Kertesz
 * @version 1.0
 * 10/5/23
 */
public class RecDieRoller
{
	private int number=0;//for storing number returned by Random object/number rolled on die
	private Random rand = new Random();//Random object for random roll
	private int rolls = 0;//for counting number of rolls in rollThousand
	
	/**
	 * empty-argument constructor for die
	 */
	public RecDieRoller()
	{
	}//end constructor
	
	/**
	 * method rolls die until a 2 is returned
	 * @return 2
	 */
	public int roll()
	{
		rolls++;//roll count relevant to rollThousand
		number = 1 + rand.nextInt(6);
		if(number != 2)
		{
			roll();//roll again if not 2
		}
		return number;
	}//end roll
	
	/**
	 * method calls the roll method 1,000 times and records how many rolls it
	 * takes to roll 2's to ultimately get the average rolls it takes to get a 2
	 * @return average number of rolls to get a 2
	 */
	public double rollThousand()
	{
		rolls = 0;//resets roll count
		
		//roll 1,000 times
		for(int i = 0; i<1000; i++)
		{
			roll();
		}
		
		return ((double)rolls)/1000.0;
		
	}//end rollThousand
}//end class