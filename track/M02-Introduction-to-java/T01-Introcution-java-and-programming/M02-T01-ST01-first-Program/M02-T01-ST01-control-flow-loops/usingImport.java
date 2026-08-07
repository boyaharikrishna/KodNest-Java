import java.util.Scanner;

public class usingImport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a byte Value");
        byte a = sc.nextByte();
        System.out.println(" byte Value is :" + a);

        System.out.println("Enter a short Value");
        short b = sc.nextShort();
        System.out.println(" short Value is :" + b);

        System.out.println("Enter a int Value");
        int c = sc.nextInt();
        System.out.println(" int Value is :" + c);

        System.out.println("Enter a float Value");
        float d = sc.nextFloat();
        System.out.println(" float Value is :" + d);

        System.out.println("Enter a boolean Value");
        boolean e = sc.nextBoolean();
        System.out.println("boolean Value is :" + e);

        System.out.println("Enter a double Value");
        double f = sc.nextDouble();
        System.out.println(" double Value is :" + f);
    }
}