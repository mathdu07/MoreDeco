package fr.mathdu07.moredeco;

public class MoreDecoUtil {
	
	/**
	 * Reverse elements of the given array and return them
	 * @param array - the array to reverse
	 * @param reversed - the array where store the reversed element
	 * @return reversed
	 */
	public static <T> T[] reverseArray(T[] array, T[] reversed)
	{
		for (int i = 0; i < array.length; i++)
			reversed[i] = array[array.length - 1 - i];
		
		return reversed;
	}

}
