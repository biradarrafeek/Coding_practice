import java.util.* ;
import java.io.*; 

public class Solution {
	public static String[] NumberPattern(int i) {
		String[] pattern = new String[i];
		for(int j=0;j<i;j++){
			StringBuilder row = new StringBuilder();

			for(int k=1;k<=i-j;k++){
				row.append(k);
			}
			pattern[j]=row.toString();
		}
		return pattern;
	}
}
