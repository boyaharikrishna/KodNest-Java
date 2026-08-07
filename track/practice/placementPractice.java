public class placementPractice {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        // Write your code here
        String res = (marks >= 60 &&  attendance >=75) ? "Placement Ready" : "Continue Preparation";
        System.out.println(res);
        for(int i=1;i<=3; i++){
            System.out.println("Practice Day: " + i);
        }
    }
}

