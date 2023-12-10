public class Ap_1 {
    /*
     * Given an array of scores, return true if each score is equal or greater than
     * the one before. The array will be length 2 or more.
     * 1 3 2
     * 0 1 2
     */
    public static boolean scoresIncreasing(int[] scores) {
        int n = scores.length;
        boolean flag = false;
        for (int i = 0; i < n - 1; i++)
            if (scores[i] <= scores[i + 1])
                flag = true;
            else
                return false;
        return flag;
    }

    /*
     * Given an array of scores, return true if there are scores of 100 next to each
     * other in the array. The array length will be at least 2.
     * 
     */
    public static boolean scores100(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++)
            if (scores[i] == 100 && scores[i + 1] == 100)
                return true;
        return false;
    }

    /*
     * Given an array of scores sorted in increasing order, return true if the array
     * contains 3 adjacent scores that differ from each other by at most 2, such as
     * with {3, 4, 5} or {3, 5, 5}.
     * [0][1][2][3]
     * [i][i + 1][i + 2][i + 3]
     */
    public boolean scoresClump(int[] scores) {
        return false;
    }
}
