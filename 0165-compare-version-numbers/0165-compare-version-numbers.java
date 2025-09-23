class Solution {
    public int compareVersion(String version1, String version2) {
        // Step 1: Strings ko parts mein divide karo
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");
        
        // Step 2: Sabse zyada parts wali length find karo
        int maxLength = Math.max(parts1.length, parts2.length);
        
        // Step 3: Har part ko compare karo
        for (int i = 0; i < maxLength; i++) {
            // Current part ko number mein convert karo, agar missing hai to 0 lelo
            int num1 = (i < parts1.length) ? Integer.parseInt(parts1[i]) : 0;
            int num2 = (i < parts2.length) ? Integer.parseInt(parts2[i]) : 0;
            
            // Compare karo
            if (num1 < num2) {
                return -1; // version1 chhoti hai
            } else if (num1 > num2) {
                return 1;  // version1 badi hai
            }
            // Agar equal hai to next part check karo
        }
        
        // Sab parts equal hain
        return 0;
    }
}