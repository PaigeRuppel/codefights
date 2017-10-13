package exercise52;

public class LongestWord {

	public String longestWord(String input) {
		String[] allWords = input.split("[^a-zA-Z]");
		String answer = allWords[0];
		for (int i = 1; i < allWords.length; i++) {
			if (allWords[i].length() > answer.length()) {
				answer = allWords[i];
			}
		}
		return answer;
	}
}
