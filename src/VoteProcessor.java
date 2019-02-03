import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		int f = 0;
		int e = 0;
		for(int i = 0;i<votes.size();i++) {
			if(votes.get(i).toLowerCase().equals("pope francis")) {
				f++;
			} else if(votes.get(i).toLowerCase().equals("edward snowden")) {
				e++;
			}
			
		}
		if(e > f) {
			return "edward snowden";
		} else if(f > e) {
			return "pope francis";
		} else {
			return "TIE";
		}
		// TODO Auto-generated method stub
		
	}

}
