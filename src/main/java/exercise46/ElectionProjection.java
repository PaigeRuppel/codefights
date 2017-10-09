package exercise46;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
		int ties = 0;
		List<Integer> withAddedVotes = new ArrayList<>();
		
		for (int i = 0; i < votes.length; i++) {
			if (votes[i] > currentMax) {
				currentMax = votes[i];
			}
			if (withAddedVotes.contains(votes[i])) {
				ties++;
			}
			withAddedVotes.add((votes[i] + k));
		}
		
		for (int current : withAddedVotes) {
			if (current > currentMax) {
				outcomes++;
			}
		}
		
		if (outcomes == 0 && ties < votes.length - 2) {
			outcomes = 1;
		}
		
		return outcomes;
	}
}
