import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();

        // mapping of digits to corresponding letters
        String[] mapping = {
            "0", "1", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        Queue<String> queue = new LinkedList<>();
        queue.add(""); // start with empty string

        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';  // convert char to int
            int size = queue.size(); // fix size before processing this digit

            // expand all existing strings in queue
            for (int j = 0; j < size; j++) {
                String current = queue.poll(); // remove front
                for (char c : mapping[digit].toCharArray()) {
                    queue.add(current + c); // append each letter
                }
            }
        }

        return new ArrayList<>(queue); // convert queue to list
    }
}
