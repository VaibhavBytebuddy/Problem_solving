package problem_solving.string;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flffower", "flffow", "ight"};
        StringBuilder sb = new StringBuilder();


        if (str == null || str.length == 0) {
            System.out.println("");
            return;
        }


        String commonPrefix = str[0];

        for (int i = 1; i < str.length; i++) {
            String current = str[i];
            int j = 0;


            while (j < commonPrefix.length() && j < current.length() && commonPrefix.charAt(j) == current.charAt(j)) {
                sb.append(commonPrefix.charAt(j));
                j++;
            }

            // Update the common prefix with the new valid prefix
            commonPrefix = sb.toString();
            sb.setLength(0); // Clear the StringBuilder for the next iteration

            if (commonPrefix.isEmpty()) { // If there's no common prefix, stop
                System.out.println("");
                return;
            }

        }
        System.out.println(commonPrefix);


    }
}
