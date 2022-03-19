/**
 * 
 */
package a04;

/**
 * @author Steven Ferguson + Matthew Fisher
 *
 */
public class Board {
	
	public Board(int[][] blocks)
	{
		//TODO
	}
	
	/**
	 * 
	 * @return
	 */
	public int size()
	{
		//TODO
		return 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public int manhattan()
	{
		//TODO
		return 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public int hamming()
	{
		//TODO
		return 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isGoal()
	{
		//TODO
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isSolvable()
	{
		int size = size();
		int inversions = 0;
		if (size % 2 == 1)
		{	//Solution for odd number sizes
			for (int i = 0; i < size -1; i++)
			{
				// get value at position i
				// find position of that value+1
				// if
			}
		}
		else
		{	//Solution for even number sizes
			
		}
		return false;
	}
	
	/**
	 * 
	 * @return
	 */	/**
	 * 
	 */
	public boolean equals(Object y) {
		//TODO
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public Iterable<Board> neighbors(){
		//TODO
		return null;
	}
	
	@Override
	public String toString() {
		//TODO
		return "Board []";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
	}
}
	