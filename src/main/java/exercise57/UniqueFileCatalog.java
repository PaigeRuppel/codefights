package exercise57;

import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
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

		int k = 1;
		String[] validNames = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			if (!uniqueNames.contains(names[i])) {
				uniqueNames.add(names[i]);
				validNames[i] = names[i];
			} 
		}
		
		for (int i = 0; i <names.length; i++) {
			if (validNames[i] == null) {
				k = 1;
				String append = "(" + k + ")";
			
				while (uniqueNames.contains(names[i] + append)) {
					k++;
				}
				
				validNames[i] = names[i] + append;
			}
		}
		
//		for (int i = 0; i < names.length; i++) {
//			if (!uniqueNames.contains(names[i])) {
//				uniqueNames.put(names[i]);
//				validNames[i] = names[i];
//			} else {
//				int k = 1;
//				String append = "(" + k + ")";
//				String checkKey = names[i] + append;
//				while (uniqueNames.get(checkKey) != null) {
//					k++;
//				}
//				uniqueNames.put(names[i] + append, names[i] + append);
//				validNames[i] = names[i] + append;
//			}
//		}

		// need a way to keep track of additions to names...
		return validNames;
	}

}
