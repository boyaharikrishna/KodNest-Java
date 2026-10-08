public class RemoveDuplicate {
    public static void main(String[] args) {
        String ss  = "aabbcc";
        String res = "";
        for(int i=0;i<ss.length();i++){
            char ch = ss.charAt(i);
            if(res.indexOf(ch) == -1){
                res = res + ch;
            
            }
        }
        System.out.println(res);
            
    }
}
