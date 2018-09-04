public class DNAMaxNucleotide {
	public String max(String[] strands, String nuc) {
		char nucleotide = nuc.charAt(0);
		int highestcount = 0;
		int answerindex = 0;

		for(int k = 0; k < strands.length; k++) {
			String strand = strands[k];
			int count = 0;
			for(int i = 0; i < strand.length(); i++) {
				if (nucleotide == strand.charAt(i)) {
					count += 1;
				}
			}
			if (count > highestcount) {
				highestcount = count;
				answerindex = k;
			}
			else if (count == highestcount) {
				if (strand.length() > strands[answerindex].length()) {
					answerindex = k;
				}
			}
		}

		if (highestcount == 0) {
			return "";
		}
		return strands[answerindex];
	}
}