package problem_solving.string;

public class SubstringsWithkDistinct {
    public static int countSubstr(String s, int k) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26]; // Array to track character frequencies
            int distinctCount = 0;

            for (int j = i; j < s.length(); j++) {
                if (freq[s.charAt(j) - 'a'] == 0) {
                    distinctCount++;
                }
                freq[s.charAt(j) - 'a']++;

                if (distinctCount == k) {
                    count++;
                } else if (distinctCount > k) {
                    break; // Stop if we exceed k distinct characters
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

      // countSubstr("aba",2);
        System.out.println( countSubstr("abaaca", 1)) ;

    }
}
