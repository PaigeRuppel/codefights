package exercise17;

public class ArrayChange {

	// Description: You are given an array of integers. On each move you are allowed to
	// increase exactly one of its element by one. Find the minimal number of
	// moves required to obtain a strictly increasing sequence from the input.
	public int orderedIncrease(int[] a) {
		int moves = 0;
		
		for (int ind = 1; ind < a.length; ind++) {
			int indPre = ind - 1;
			if (a[ind] <= a[indPre]) {
				int difference = (a[indPre] - a[ind]) + 1;
				moves = moves +  (difference );
				a[ind] = a[ind] + difference;
			}
		}
		return moves;
	}

}
