package exercise57;

import java.util.HashSet;
import java.util.Set;

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
		Set<String> uniqueNames = new HashSet<String>();
		String[] validNames = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			String currentEntry = names[i];
			if (!uniqueNames.contains(currentEntry)) {
				uniqueNames.add(currentEntry);
				validNames[i] = currentEntry;
			} else {
				int k = 1;
				while (uniqueNames.contains(appendSuffixToFile(currentEntry, k))) {
					k++;
				}
				uniqueNames.add(appendSuffixToFile(currentEntry, k));
				validNames[i] = appendSuffixToFile(currentEntry, k);
			}
		}
		return validNames;
	}

	private String appendSuffixToFile(String currentEntry, int k) {
		return currentEntry + "(" + k + ")";
	}
}
