public class FitnessChallenge {

    public static void main(String[] args) {

        // Push-ups done each day for 7 days
        int[] pushUpsPerDay = {30, 25, 0, 40, 35, 0, 50};

        int totalPushUps = 0;
        int activeDays = 0;

        // for-each loop to calculate total and average
        for (int pushUps : pushUpsPerDay) {

            // skip rest days
            if (pushUps == 0) {
                continue;
            }

            totalPushUps += pushUps;
            activeDays++;
        }

        // calculate average
        double averagePushUps = (double) totalPushUps / activeDays;

        // display results
        System.out.println(" Sandeep's Fitness Report");
        System.out.println("Total Push-ups: " + totalPushUps);
        System.out.println("Average Push-ups per active day: " + averagePushUps);
    }
}
