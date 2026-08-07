import java.util.Scanner;

public class usingLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = sc.nextInt();
        System.out.println(" Your age is:" + age);

        System.out.println("Enter Your height");
        float height = sc.nextFloat();
        System.out.println(" Your height is:" + height);
        sc.nextLine();
        System.out.println("Enter Your fullName");
        String fName = sc.nextLine();
        System.out.println(" Your fNmae is:" + fName);

    }
}
