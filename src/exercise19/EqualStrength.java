package exercise19;

import java.util.HashMap;
import java.util.Map;

public class EqualStrength {

	public boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		
		int[] strengths = {yourLeft, yourRight, friendsLeft, friendsRight};
		Map<Integer, String> strengthMap = new HashMap<>();
		
			for (int ind = 0 ; ind < strengths.length; ind++) {
				if (!strengthMap.isEmpty() && strengthMap.containsKey(strengths[ind])) {
					strengthMap.remove(strengths[ind]);
				} else {
					strengthMap.put(strengths[ind], " ");
				}
				
				if (yourLeft == yourRight && friendsLeft == friendsRight && yourLeft + yourRight != friendsLeft + friendsRight) {
					return false;
				}
				else if (strengthMap.isEmpty()) {
					return true;
				}
			}
		return false;
	}

}
