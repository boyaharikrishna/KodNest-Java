
public class progressReport {

    public static void main(String[] args) {
        int completedTopics = 17;
        int TotalTopics = 20;
        int Dailylearninghours = 3;
        int Learningdays = 5;
        int remaining = TotalTopics - completedTopics;
        int weeklylearningHours = Learningdays * Dailylearninghours;
        double progressPercentage = completedTopics * 100 / TotalTopics;
        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + remaining);
        System.out.println("Weekly Learning Hours: " + weeklylearningHours);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
