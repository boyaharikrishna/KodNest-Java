class Addition {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(int a, double b, double c) {
        return a + b + c;
    }

    double add(double a, int b) {
        return a + b;
    }

}

public class MethodOverLoading {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(10,20));
        System.out.println(a.add(10.0, 3.2));
        System.out.println(a.add(5.2, 1));
        System.out.println(a.add(1, 2.2, 3.5));
        System.out.println(a.add(1, 5.5));

    }
}
