package lpf.learn.leetcode.tags.array;

public class MinimumHoursOfTrainingToWinACompetition {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hour = 0;
        int n = energy.length;

        int totalEnergy = 0;
        for (int i = 0; i < n; i++) {
            totalEnergy += energy[i];

            if (initialExperience <= experience[i]) {
                int temp = experience[i] - initialExperience + 1;
                hour += temp;
                initialExperience += temp;
            }
            initialExperience += experience[i];
        }
        if (initialEnergy <= totalEnergy) {
            hour += totalEnergy - initialEnergy + 1;
        }
        return hour;
    }
}
