package exercise50;

import java.util.regex.Pattern;

public class ChessBoard {

	/*
	 * Given a position of a knight on the standard chessboard, find the number of
	 * different moves the knight can perform.
	 * 
	 * The knight can move to a square that is two squares horizontally and one
	 * square vertically, or two squares vertically and one square horizontally away
	 * from it. The complete move therefore looks like the letter L. Check out the
	 * image below to see all valid moves for a knight piece that is placed on one
	 * of the central squares.
	 */

	public int chessKnight(String cell) {
		cell.toUpperCase();
		int moves = 8;
		if (Pattern.matches("([A,H][1,8])", cell)) {
			moves = 2;
		}
		if (Pattern.matches("([B,G][1,8]||[A,H][2,7])", cell)) {
			moves = 3;
		}
		if (Pattern.matches("([B,G][2,7]||[A,H][3-6]||[C-F][1,8])", cell)) {
			moves = 4;
		}
		if (Pattern.matches("([C-F][2,7]||[B,G][3-6])", cell)) {
			moves = 6;
		}
		return moves;
	}

}
