package OOPS;
class Book{
    private int pageNum;
    public void setData(int x){
        pageNum = x;
    }
   public void getData(){
        System.out.println(pageNum);
    }
}
public class BookApplication {
    public static void main(String[] args) {
        Book b = new Book();
        b.setData(-10);
        b.getData();
    }
}
