
public class practiceReport {

    public static void main(String[] args) {
        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        // Write your code here.
        double a = (int) solvedProblems;
        int WholePercentage = (int) exactPercentage;
        double c = (double) solvedProblems / practiceDays;
        boolean DailyTargetReached = true;
        System.out.println("Report Value: " + a);
        System.out.println("Whole Percentage: " + WholePercentage);
        System.out.println("Average Per Day: " + c);
        System.out.println("Daily Target Reached: " + DailyTargetReached);

    }
}
