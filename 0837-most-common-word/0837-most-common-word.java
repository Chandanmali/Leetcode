class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
         String normalizedStr = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String[] words = normalizedStr.split("\\s+");
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            if (!bannedSet.contains(word) && !word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentWord;
    }
}
