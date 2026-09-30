package OOPS;

class Book {
    private int pageNum;

    public void setData(int x) {
        pageNum = x;
    }

    public void getData() {
        System.out.println(pageNum);
    }

    private String gold;

    public void setDat(String x) {
        gold = x;
    }

    public void getDat() {
        System.out.println(gold);
    }
}

public class BookApplication {
    public static void main(String[] args) {
        Book b = new Book();
        b.setData(-1000);
        b.getData();
        b.setDat("It is procteded");
        b.getDat();
    }
}
