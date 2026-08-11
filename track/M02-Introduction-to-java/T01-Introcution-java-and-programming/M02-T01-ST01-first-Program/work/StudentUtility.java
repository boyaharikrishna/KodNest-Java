
import java.util.Scanner;

class StudentUtility {
    // Create the four required methods
   static void showReportTitle(){
        System.out.println("Student Performance Report");
    }
    static void displayStudent(int id,String name){
        System.out.println("ID: " + id);
        System.out.println("Name: "+name);
    }
    static double getPassingPercentage(){
        return 60.0;
    }
    static double getcalculatePercentage(int javaScore , int sqlScore){
    double percentage = (javaScore + sqlScore)/2.0;
    return percentage;
    }
}

 class StudentUtilityes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        // Read input, call methods and display the result
        utility.showReportTitle();
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        utility.displayStudent(id,name);
        utility.getPassingPercentage();
        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();
        double percentage = utility.getcalculatePercentage(javaScore , sqlScore);
        double passPercentage = utility.getPassingPercentage();
        String res = (percentage >= passPercentage) ? "Result: PASS" :"Result: NEEDS IMPROVEMENT";
        System.out.println("Percentage: " + percentage);
        System.out.println(res);
        scanner.close();
    }
}