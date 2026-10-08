package OOPS;

class Pare {
    void dis1() {
        System.out.println("inside par dis1");
    }

    void dis2() {
        System.out.println("inside par dis2");

    }
}

class Chil1 extends Pare {
    void dis2() {
        System.out.println("inside chil1 dis1");
    }

    void dis3() {
        System.out.println("inside chil1 dis2");

    }
}

class Chil2 extends Pare {
    void dis2() {
        System.out.println("inside chil2 dis1");
    }

    void dis3() {
        System.out.println("inside chil2 dis2");

    }
}

public class DownCasting {
    public static void main(String[] args) {
        Pare p = new Chil1();
        p.dis1();
        p.dis2();
        ((Chil1) (p)).dis3();
    }
}
