package codefights;

public class AlternatingSumsExercise14 {

	int[] alternatingSums(int[] a) {

	    int tm1Wt = a[0];
	    int tm2Wt = 0;
	    
	    for (int i = 1; i < a.length; i++) {
	        if (i % 2 == 0) {
	            tm1Wt = tm1Wt + a[i];
	        }       
	        if (i % 2 == 1) {
	            tm2Wt= tm2Wt + a[i];
	        }
	    }

	    int[] answer = new int[2];
	    
	    answer[0] = tm1Wt;
	    answer[1] = tm2Wt;
	    
	    return answer;

	}
}
