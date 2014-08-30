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
		if (array.length != reversed.length)
			throw new IllegalArgumentException("array and reversed must have the same length");
		
		for (int i = 0; i < array.length; i++)
			reversed[i] = array[array.length - 1 - i];
		
		return reversed;
	}
	
	/**
	 * Cut a sequence of the given array to a new one
	 * @param array - the array  to cut
	 * @param cut - the array that stores the cut sequence
	 * @param begin - first index of the sequence to cut (inclusive),
	 *     between 0 and array's length (exclusive)
	 * @param end - last index of the sequence to cut (exclusive),
	 *     between 0 and array's length (inclusive)
	 * @return cut sequence
	 */
	public static <T> T[] cutArray(T[] array, T[] cut, int begin, int end)
	{
		if (begin < 0  || begin >= array.length)
			throw new IllegalArgumentException("begin must be between 0 and array's length (exclusive)");
		if (end < 0 || end > array.length)
			throw new IllegalArgumentException("end must be between 0 and array's length (inclusive)");
		if (cut.length != (end - begin))
			throw new IllegalArgumentException("cut is too small to receive the sequence");
		
		for (int i = 0; i < (end - begin); i++)
			cut[i] = array[i + begin];
		
		return cut;
	}
	
	/**
	 * Cut a sequence from the beginning to end of the given array to a new one
	 * @param array - the array  to cut
	 * @param cut - the array that stores the cut sequence
	 * @param end - last index of the sequence to cut (exclusive)
	 * @return cut sequence
	 */
	public static <T> T[] cutArray(T[] array, T[] cut, int end)
	{
		return cutArray(array, cut, 0, end);
	}

}
