package exercise59;

public class SpiralMatrix {

	int[][] spiralNumbers(int n) {
		int[][] array = new int[n][n];

		int left = 0;
		int right = n - 1;
		int top = 0;
		int down = n - 1;

		for (int counter = 1; counter <= n * n;) {
			for (int col = left; col <= right; col++) {
				array[top][col] = counter++;
			}
			top++;

			for (int row = top; row <= down; row++) {
				array[row][right] = counter++;
			}
			right--;

			for (int col = right; col >= left; col--) {
				array[down][col] = counter++;
			}
			down--;

			for (int row = down; row >= top; row--) {
				array[row][left] = counter++;
			}
			left++;
		}

		return array;
	}
}
