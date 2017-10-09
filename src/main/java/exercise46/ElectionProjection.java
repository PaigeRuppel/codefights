package exercise46;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ElectionProjection {

	/*
	 * Elections are in progress!
	 * 
	 * Given an array of the numbers of votes given to each of the candidates so
	 * far, and an integer k equal to the number of voters who haven't cast their
	 * vote yet, find the number of candidates who still have a chance to win the
	 * election.
	 * 
	 * The winner of the election must secure strictly more votes than any other
	 * candidate. If two or more candidates receive the same (maximum) number of
	 * votes, assume there is no winner at all.
	 */

	public int electionsWinners(int[] votes, int k) {
		int outcomes = 0;
		int currentMax = 0;
		Map<Integer, Integer> withAddedVotes = new HashMap<>();
		
		for (int i = 0; i < votes.length; i++) {
			if (votes[i] > currentMax) {
				currentMax = votes[i];
			}
			withAddedVotes.put(votes[i], votes[i] + k);
		}
		Collection<Integer> newTallies = withAddedVotes.values();
		for (int current : newTallies) {
			if (current > currentMax) {
				outcomes++;
			}
		}
		return outcomes;
	}
}
