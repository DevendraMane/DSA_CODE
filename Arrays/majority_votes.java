package Arrays;

import java.util.Arrays;

public class majority_votes {
    public static int[] majorityVotes(int votes[]) {
        int n = votes.length, majority = n / 3, count = 1;
        Arrays.sort(votes);

        int winners[] = new int[n];
        int winIndx = 0;

        for (int i = 1; i <= n - 1; i++) {
            if (votes[i] == votes[i - 1]) {
                count++;
            } else {
                if (count > majority) {
                    winners[winIndx++] = votes[i - 1];
                }
                count = 1;
            }

            if (count > majority) {
                winners[winIndx++] = votes[n - 1];
            }

        }

        int finalResult[] = new int[winIndx];
        for (int i = 0; i < winIndx; i++) {
            finalResult[i] = winners[i];
        }

        return finalResult;

    }

    public static void main(String[] args) {
        int votes[] = { 2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6 };
        System.out.println(majorityVotes(votes));
    }
}