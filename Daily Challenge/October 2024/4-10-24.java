// 2491. Divide Players Into Teams of Equal Skill

import java.util.Arrays;

class Solution {

    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int len = skill.length;
        int total = skill[0] + skill[len - 1];
        long res = 0;
        for (int i = 0; i < len / 2; i++) {
            if (skill[i] + skill[len - i - 1] != total) {
                return -1;
            }
            res += (long) skill[i] * skill[len - i - 1];
        }
        return res;
    }
}
