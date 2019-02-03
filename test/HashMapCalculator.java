import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> h1, HashMap<String, String> h2) {
		// TODO Auto-generated method stub
		int t = 0;
		for(String s:h1.keySet()) {
			for(String ss:h2.keySet()) {
				if(ss.equals(s)) {
					if(h1.get(s).equals(h2.get(ss))) {
						t++;
					}
				}
			}
		}
		return t;
	}

}
