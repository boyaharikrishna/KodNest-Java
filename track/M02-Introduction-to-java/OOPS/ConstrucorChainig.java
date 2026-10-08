package OOPS;

class Parents {
    Parents() {
      
        System.out.println("Inside Paret 0 paramerer");
    }
}

class Childs extends Parents {
    Childs() {
        this(10);
        System.out.println("Child 0 parameter");
    }

    Childs(int a) {
        this(10, 20);
        System.out.println("Inside child 1 para ");
    }

    Childs(int a, int b) {
        System.out.println("Inside chikd 2 parameter");
    }
}

public class ConstrucorChainig {
    public static void main(String[] args) {
        Childs c1 = new Childs();
    }

}