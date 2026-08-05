
public class Calculate {

    public static void main(String[] args) {
        // write your code here
        double principle = 10000.0;
        float rate = 6.5f;
        float time = 2.0f;
        double Weight = 72.0;
        double height = 1.8;
        int marks1 = 78;
        int marks2 = 84;
        int marks3 = 69;
        int marks4 = 91;
        int marks5 = 88;
        int sub = 100;
        double simpleInterset = principle * rate * time / 100.0;
        double totalAmount = principle + simpleInterset;
        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        double bmi = Weight / (height * height);
        double percentage = total * 100.0 / 500;
        System.out.println("Simple Interest: " + simpleInterset);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
    }
}
