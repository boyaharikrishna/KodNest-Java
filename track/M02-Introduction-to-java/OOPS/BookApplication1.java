package OOPS;
class Book1 {
private int pageNum;
public void setData(int x){
    if(x>0){
        pageNum = x;
    }
}
public int getData(){
    return pageNum;
}
}
public class BookApplication1 {
    public static void main(String[] args) {
        Book1 b = new Book1();
        b.setData(-100);
        System.out.println(b.getData());
    }
}
