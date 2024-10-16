// 1395. Count Number of Teams

// There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
// You have to form a team of 3 soldiers amongst them under the following rules:
// Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
// A team is valid if: (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
// Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).
// Example 1:
// Input: rating = [2,5,3,4,1]
// Output: 3
// Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1). 
class Solution {

    public int numTeams(int[] rating) {
        int total = 0;
        int n = rating.length;

        for (int i = 0; i < n; i++) {
            int rightLess = 0, rightMore = 0, leftLess = 0, leftMore = 0;

            // Count soldiers after i
            for (int j = i + 1; j < n; j++) {
                if (rating[j] < rating[i]) {
                    rightLess++; 
                }else if (rating[j] > rating[i]) {
                    rightMore++;
                }
            }

            // Count soldiers before i
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    leftLess++; 
                }else if (rating[j] > rating[i]) {
                    leftMore++;
                }
            }

            // Calculate the total number of valid teams
            total += rightLess * leftMore + rightMore * leftLess;
        }

        return total;
    }
}
