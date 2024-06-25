class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
		
        String str = s.trim();

		// We are looking for the last word so let's go backward
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') { // a letter is found so count
                break;
            } else {  // it's a white space instead
				//  Did we already started to count a word ? Yes so we found the last word
                length++;
            }
        }

        return length;
    }
}