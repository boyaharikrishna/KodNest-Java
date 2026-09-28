package String;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        sb1.ensureCapacity(100);
       System.out.println(sb1.capacity());
       System.out.println(sb1);
       sb1.append(" program");
       System.out.println(sb1);
    }
}
