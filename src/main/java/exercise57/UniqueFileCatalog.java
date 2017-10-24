package exercise57;

import java.util.ArrayList;
import java.util.List;

public class UniqueFileCatalog {

	/*
	 * You are given an array of desired filenames in the order of their creation.
	 * Since two files cannot have equal names, the one which comes later will have
	 * an addition to its name in a form of (k), where k is the smallest positive
	 * integer such that the obtained name is not used yet.
	 * 
	 * Return an array of names that will be given to the files.
	 */
	
	public String[] fileNaming(String[] names) {
		List<String> uniqueNames = new ArrayList<>();
		int count = 1;
		for (int i = 0; i < names.length; i++ ) {
			if (!uniqueNames.contains(names[i])) {
				uniqueNames.add(i, names[i]);
			} else {
				count++;
				uniqueNames.add(i, names[i] + "(" + count+ ")");
			}
		}
		String[] answer = uniqueNames.toArray(new String[names.length]);
		return answer;
	}

}
