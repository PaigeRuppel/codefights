package codefights;

public class ReverseParenthesesExercise13 {


	String reverseParentheses(String s) {

		int start = s.lastIndexOf('(');

		while (start != -1) {

			// finds end of last reg bracket sequence, starting with the last
			// opening parentheses
			int end = s.indexOf(')', start);

			// creates substring consisting of everything up to first reg
			// bracket sequence
			String t = s.substring(0, start);

			t += new StringBuffer(s.substring(start + 1, end)).reverse().toString();
			t += s.substring(end + 1);
			s = t;
			start = s.lastIndexOf('(');
		}

		return s;
	}

}
