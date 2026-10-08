public class Anagram {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

       for(int i=0;i<a.length();i++){
        char aa = a.charAt(i);
        for(int j=0;i<b.length();j++){
        char bb = b.charAt(j);
        if(aa==bb){
            System.out.println("Anagram");
        }else{
            System.out.println("no");
        }
        }

       }
    }
}
