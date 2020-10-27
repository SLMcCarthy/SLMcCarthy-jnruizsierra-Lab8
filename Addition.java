/** This is our code, it stores nodes as operators
 *  C312- Lab 8
 * @authors Shane McCarthy, Jomaly Ruiz Sierra, Christina Lutton
 */


public class Addition extends Operator
{
	Number left;
	Number right;

	public int Addition()
	{
		super(left, right);
		return (left + " + " + right);
	}

}

