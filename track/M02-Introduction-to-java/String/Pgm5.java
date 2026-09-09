package String;

public class Pgm5 {
    public static void main(String[] args) {
          String s6 = "Java";
        String s7 = "java";
        if(s6==s7){
            System.out.println("Ref are equal");
        }else{
            System.out.println("Ref are no equal");
        }
        if(s6.equalsIgnoreCase(s7)){
               System.out.println("Ref are equal");
        }else{
               System.out.println("Ref are NOt equal");
        }
    }
}
