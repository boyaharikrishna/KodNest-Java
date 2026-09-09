package String;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hari Krishna";

        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
        String s1 = " ";
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());
         String s2 = "";
        System.out.println(s2.isBlank());
        System.out.println(s2.isEmpty());








        System.out.println(str);

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        System.out.println(str.charAt(3));

        System.out.println(str.contains("Hari"));

        System.out.println(str.contains("Krish"));

        System.out.println(str.startsWith("Hari"));

        System.out.println(str.startsWith("Krishna"));

        System.out.println(str.endsWith("krishna"));

        System.out.println(str.endsWith("Hari"));

        System.out.println(str.indexOf('H'));

        System.out.println(str.indexOf('k'));

        System.out.println(str.length());

        System.out.println(str.replace('a','A'));

        System.out.println(str.substring(3));

        System.out.println(str.substring(3,6));

        String s3 = " Java ";
        System.out.println(s3);
        System.out.println(s3.trim());
    }
}
